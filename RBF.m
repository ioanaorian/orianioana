clear;
close all;
clc;

load('proj_fit_06.mat');
%Datele de identificare
x1=id.X{1};
x2=id.X{2};
y=id.Y;
k=0;%lungimea vectorului y_id
for i=1:41 %Transform matricea patratica Y intr-o matrice cu o linie(un vector)
    for j=1:41
      k=k+1;
      y_id(k)=y(i,j);
    end 
end
surf(x1,x2,y); %Reprezentarea grafica a datelor de identificare
xlabel('X1')
ylabel('X2')
zlabel('Y')
title('Reprezentarea datelor de identificare')
p=0;%lungimea vectorilor mse_id si mse_val
b1=1.833; %Raza RBF-ului de dimensiune 1
b2=1.936; %Raza RBF-ului de dimensiune 2
minid=inf;

%Datele de validare
xv1=val.X{1};
xv2=val.X{2};
yv=val.Y;
k=0;%lungimea vectorului y_val
for i=1:71 %Transform matricea patratica Y intr-o matrice cu o linie(un vector)
    for j=1:71
      k=k+1;
      y_val(k)=yv(i,j);
    end 
end
figure
surf(xv1,xv2,yv) %Reprezentarea grafica a datelor de validare
xlabel('X1')
ylabel('X2')
zlabel('Y')
title('Reprezentarea datelor de validare')
minval=inf;

for R=1:35
    %Determinarea centrelor RBF-ului de lungime R
    c1=linspace(-2,2,R);
    c2=linspace(-2,2,R);
    
    l1=0;
    l2=1;
    %Determinarea lui phi pentru datele de identificare
    for j1=1:41  %Parcugerea vectorului x1
        for j2=1:41  %Parcurgerea vectorului x2 
            l1=l1+1;
            l2=1;
            for i1=1:R
                for i2=1:R
                    fi_id(l1,l2)=exp(-((x1(j1)-c1(i1))^2)/(b1^2)-((x2(j2)-c2(i2))^2)/(b2^2));
                    l2=l2+1; 
                end  
            end
        end 
    end
  
    theta=fi_id\y_id';
    yid=fi_id*theta;
    
    v1=0;
    v2=1;
    %Determinarea lui phi pentru datele de validare
    for j1=1:71  %Parcugerea vectorului x1
        for j2=1:71  %Parcurgerea vectorului x2 
            v1=v1+1;
            v2=1;
            for i1=1:R
                for i2=1:R
                    fi_val(v1,v2)=exp(-((xv1(j1)-c1(i1))^2)/(b1^2)-((xv2(j2)-c2(i2))^2)/(b2^2));
                    v2=v2+1; 
                end  
            end
        end 
    end
    
    yval=fi_val*theta;
    
    p=p+1;
    mse_id(p)=mean((y_id-(yid)').^2); %Se calculeaza eroarea pentru datele de identificare
    mse_val(p)=mean((y_val-(yval)').^2); %Se calculeaza eroarea pentru datele de validare
    if mse_val(p)<minval
        minid=mse_id(p);%se determina eroarea medie minima pentru datele de identificare
        YID=yid;
        minval=mse_val(p);%se determina eroarea medie minima pentru datele de validare
        YVAL=yval;
        e=R;%pozitia pe care se afla eroarea minima
    end     
end

%transformam YID calculat intr-o matrice 
 l=0;
 for m=1:41
     for n=1:41
         l=l+1;
         YID1(n,m)=YID(l);
     end    
 end 

%transformam YVAL1 calculat intr-o matrice 
 l=0;
 for m=1:71
     for n=1:71
         l=l+1;
         YVAL1(n,m)=YVAL(l);
     end    
 end 
%Reprezentarea aproximarilor pentru identificare
figure
surf(x1,x2,YID1')
xlabel('X1')
ylabel('X2')
zlabel('Y')
title(['Aproximarea datelor de indentificare MSE=',num2str(minid)])
R=1:35;
figure
plot(R,mse_id);
title('Eroare date identificare')
xlabel('R')
ylabel('MSE')
%Reprezentarea aproximarilor pentru validare
figure
surf(xv1,xv2,YVAL1');
xlabel('X1')
ylabel('X2')
zlabel('Y')
title(['Aproximarea datelor de validare MSE=',num2str(minval)])
R=1:35;
figure
plot(R,mse_val);
title('Eroare date validare')
xlabel('R')
ylabel('MSE')