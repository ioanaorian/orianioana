package orian.ioana.lab4.ex6;

public class TestShape {
    
    public static void main(String[] args){
        Shape s1=new Shape();
        System.out.println(s1.toString());
        Shape s2;
        s2 = new Shape("blue",false);
        System.out.println(s2.toString());
    }
}
