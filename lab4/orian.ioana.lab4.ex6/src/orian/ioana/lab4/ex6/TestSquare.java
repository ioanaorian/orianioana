package orian.ioana.lab4.ex6;

public class TestSquare {
    
    public static void main(String args[]){
        
        Square s1=new Square();
        System.out.println(s1.toString());
        Square s2=new Square(10);
        System.out.println(s2.toString());
        Square s3=new Square(3.3,"blue",false);
        System.out.println(s3.toString());
        System.out.println(s1.getArea());
        System.out.println(s2.getColor());
        System.out.println(s2.getSide());
        System.out.println(s3.getWidth());
        System.out.println(s3.getLength());
    }        
}
