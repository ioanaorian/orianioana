package orian.ioana.lab5.ex1;

    
public class Test {

    public static void main(String[] args) {

        Shape[] shapes=new Shape[2];
            shapes[0]=new Circle();
            double a1=shapes[0].getArea();
            System.out.println("Aria este "+a1);
            shapes[1]=new Rectangle();
            double a2=shapes[1].getArea();
            System.out.println("Aria este "+a2);
            
            
        }
        
    }

