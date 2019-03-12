package orian.ioana.lab3.ex2;

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

    Circle(String color) {
        this.radius = 5.5;
        this.color = color;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        double r = this.getRadius();
        return 3.14 * r * r;
    }
}
