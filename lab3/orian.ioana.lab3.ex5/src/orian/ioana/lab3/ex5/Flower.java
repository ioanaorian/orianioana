package orian.ioana.lab3.ex5;

public class Flower {

    int petal;
    static int nr=0;
    Flower(int p){
        petal=p;
        System.out.println("New flower has been created!");
        nr++;
    }
    static int count(){
        return nr;
    }
    
       public static void main(String[] args){
        
        Flower f1=new Flower(5);
        Flower f2=new Flower(8);
        Flower f3=new Flower(13);
        System.out.println("Numarul florilor create este "+count());
    }
    
}
