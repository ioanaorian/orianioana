package orian.ioana.lab4.ex6;

public class TestCircle {

    public static void main(String[] args) {

        Circle c1 = new Circle();
        System.out.println(c1.getRadius() + " " + c1.getColor() + " " + c1.isFILLED());
        Circle c2=new Circle(6.5,"yellow",false);
        System.out.println(c2.getRadius() + " " + c2.getColor() + " " + c2.isFILLED());
        c1.setRadius(7.7);
        System.out.println(c1.getRadius() + " " + c1.getColor() + " " + c1.isFILLED());
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.toString());
        
    }
}
