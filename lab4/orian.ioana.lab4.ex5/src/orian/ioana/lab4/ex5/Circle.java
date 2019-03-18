package orian.ioana.lab4.ex5;

public class Circle {

    private double radius;
    private String color;

    Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    Circle(double radius) {
        this.radius = radius;
        this.color = "green";
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        double r = this.getRadius();
        return 3.14 * r * r;
    }

}
