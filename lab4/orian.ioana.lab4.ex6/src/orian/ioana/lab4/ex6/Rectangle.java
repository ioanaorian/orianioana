package orian.ioana.lab4.ex6;

public class Rectangle extends Shape {

    private double width = 1.0;
    private double length = 1.0;

    Rectangle() {
        this.length = 1.0;
    }

    Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        double w = this.getWidth();
        double l = this.getLength();
        return w * l;
    }

    public double getPerimeter() {
        double w = this.getWidth();
        double l = this.getLength();
        return 2 * (w + l);
    }

    @Override
    public String toString() {
        return ("A Rectangle with width=" + width + " and length=" + length + " ,which is a subclass of " + super.toString());
    }

}
