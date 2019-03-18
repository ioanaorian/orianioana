package orian.ioana.lab4.ex1;

public class TestCircle {

    public static void main(String args[]) {

        Circle c1 = new Circle();
        Circle c2 = new Circle(2.55);
        double r1 = c1.getRadius();
        double s1 = c2.getArea();
        System.out.println("Cercul c1 are raza " + r1);
        System.out.println("Cercul c2 are aria " + s1);

    }

}
