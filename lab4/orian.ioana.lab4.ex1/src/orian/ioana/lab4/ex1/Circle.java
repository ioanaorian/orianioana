package orian.ioana.lab4.ex1;

public class Circle {

    private double radius = 0.1;
    private String color = "red";

    Circle() {
        this.radius = 5.33;
        this.color = "green";
    }

    Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        double r = this.getRadius();
        return 3.14 * r * r;
    }

}
