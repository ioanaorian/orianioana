clear all;
close all;
clc;

load('iddata-06.mat');
% Datele de identificare
uid=id.u;
yid=id.y;
% gradul polinomului
m=5;
% ordinul sistemului
na=1;
nb=na;
% intarzierea sistemului
nk=1;
% construiesc vectorul l, el contine toate puterile cuprinse intre 0 si m
l=[0];
for i=1:m
    l=[l,i];
end    
nmcp=(m+1)^(na+nb);% determin numarul maxim de cominatii ale puterilor
r=1;% numarul de repetitii a puterilor pe coloane
% construiesc matricea putere
% matricea putere contine toate combinatiile de puteri posibile
for j=1:na+nb % parcurg coloanele matricei putere
    i=1;
    il=1; % cu i1 parcurg vectorul l
    while(i<=nmcp)% parcurg liniile matricei putere
        for k=1:r 
            putere(i,j)=l(il); % adaug elemente in matricea putere
            i=i+1;
        end
        if(il==length(l)) 
            il=1;
        else
            il=il+1;
        end
    end    
    r=r*(m+1); 
end   
i=1;
% salvez doar puterile de care am nevoie pentru determinarea polinomului
% suma puterilor nu trebuie sa fie mai mare decat gradul polinomului
while (i<=nmcp)
    suma=0;
    for j=1:na+nb
        suma=suma+putere(i,j);
    end    
    if (suma>m || suma==1 || suma==0)
        putere(i,:)=[]; % stergem o linie din matricea putere
        nmcp=nmcp-1; 
    else    
        i=i+1;
    end 
end 

% determinarea lui fi pentru datele de identificare
N=length(yid);  
fi=[];
%predictie
for k=1:N
    for i=1:na
        if(k-i<=0)
            fi(k,i)=0;
            fi(k,i+na)=0;
        else
            fi(k,i)=yid(k-i);
            fi(k,i+na)=uid(k-i);
        end
    end
    for i=1:nmcp % parcurg liniile matricei putere
        a=1;
        for j=1:na  % parcurg coloanele matricei putere
            if(k-j<=0) 
                    a=0;
            else
                a=a*((yid(k-j))^(putere(i,j)))*(uid(k-j)^(putere(i,j+na)));
            end
        end   
        fi(k,na+nb+i)=a;
    end    
    fi(k,na+nb+nmcp+1)=1;
end
theta=fi\yid; % aplicand regresia liniara determin vectorul de parametrii
ypredictie=fi*theta;
mse=mean((yid-ypredictie).^2); % determin eroarea in cazul predictiei
plot(yid) 
hold on
plot(ypredictie);  
xlabel('K')
ylabel('Y')
title(['Predictia pentru datele de identificare, MSE=',num2str(mse)])
legend('y identificare','y predictie')

% simulare
fi1=[];
matrice=[];
for k=1:N
    for i=1:na
        if(k-i<=0)
            fi1(i)=0;
            fi1(i+na)=0;
        else
            fi1(i)=yai(k-i);
            fi1(i+na)=uid(k-i);
        end
    end
    for i=1:nmcp % parcurg liniile matricei putere
        a=1;
        for j=1:na % parcurg coloanele matricei putere
            if(k-j<=0)  
                a=0;
            else
                a=a*((yai(k-j))^(putere(i,j)))*(uid(k-j)^(putere(i,j+na)));
            end
        end   
        fi1(na+nb+i)=a;
    end    
    fi1(na+nb+nmcp+1)=1;
    yai(k)=fi1*theta; % determin y aproximat
end
mse=mean((yid-yai').^2); % determin eroarea in cazul simularii
figure
plot(yid)
hold on
plot(yai)
xlabel('K')
ylabel('Y')
title(['Simularea pentru datele de identificare MSE=',num2str(mse)])
legend('y identificare','y simulare')

% Datele de validare
yv=val.y;
uv=val.u;
% determinarea lui fi pentru datele de validare
N=length(yv);  
fiv=[];
%predictie
for k=1:N
    for i=1:na
        if(k-i<=0)
            fiv(k,i)=0;
            fiv(k,i+na)=0;
        else
            fiv(k,i)=yv(k-i);
            fiv(k,i+na)=uv(k-i);
        end
    end
    for i=1:nmcp % parcurg liniile matricei putere
        a=1;
        for j=1:na % parcurg coloanele matricei putere
            if(k-j<=0)  
                a=0;
            else
                a=a*((yv(k-j))^(putere(i,j)))*(uv(k-j)^(putere(i,j+na)));
            end
        end   
        fiv(k,na+nb+i)=a;
    end    
    fiv(k,na+nb+nmcp+1)=1;
end
yvp=fiv*theta;
mse=mean((yv-yvp).^2); % determin eroarea in cazul predictiei
figure
plot(yv)
hold on
plot(yvp);  
xlabel('K')
ylabel('Y')
title(['Predictia pentru datele de validare MSE=',num2str(mse)])
legend('y validare','y predictie')

% simulare
fi1=[];
for k=1:N
   for i=1:na
        if(k-i<=0)
            fi1(i)=0;
            fi1(i+na)=0;
        else
            fi1(i)=yav(k-i);
            fi1(i+na)=uv(k-i);
        end
    end
    for i=1:nmcp % parcurg liniile matricei putere
        a=1;
        for j=1:na % parcurg coloanele matricei putere
            if(k-j<=0)  
                a=0;
            else
                a=a*((yav(k-j))^(putere(i,j)))*(uv(k-j)^(putere(i,j+na)));
            end
        end   
        fi1(na+nb+i)=a;
    end    
    fi1(na+nb+nmcp+1)=1; 
    yav(k)=fi1*theta; 
end
mse=mean((yv-yav').^2); % determin eroarea in cazul simularii
figure
plot(yv)
hold on
plot(yav)
xlabel('K')
ylabel('Y')
title(['Simularea pentru datele de validare MSE=',num2str(mse)])
legend('y validare','y simulare')



  