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
            Square a3=new Square();
            System.out.println(a3.toString());
            a3.setWidth(5.5);
            a3.setLength(7);
            System.out.println(a3.getLength());
            System.out.println(a3.getWidth()); 
            
        }
        
    }

