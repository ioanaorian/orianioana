package orian.ioana.lab3.ex2;

public class TestCircle {

    public static void main(String[] args) {

        Circle c1 = new Circle();
        Circle c2 = new Circle(5.22);
        Circle c3 = new Circle("blue");
        double f1 = c1.getRadius();
        double f2 = c2.getRadius();
        double f3 = c3.getRadius();
        double d1 = c1.getArea();
        double d2 = c2.getArea();
        double d3 = c3.getArea();

        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }
}
