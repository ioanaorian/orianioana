package orian.ioana.lab4.ex6;

public class TestRectangle {

    public static void main(String args[]) {

        Rectangle r1 = new Rectangle();
        System.out.println(r1.toString());
        Rectangle r2 = new Rectangle(3, 7);
        System.out.println(r2.toString());
        Rectangle r3 = new Rectangle(4, 10, "red", false);
        System.out.println(r3.toString());
        r1.setWidth(5);
        System.out.println(r1.getWidth());
        r2.setLength(12);
        System.out.println(r2.getLength());
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());
    }
}
