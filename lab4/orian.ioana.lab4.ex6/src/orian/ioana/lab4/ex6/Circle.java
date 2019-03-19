package orian.ioana.lab4.ex6;

public class Circle extends Shape {
    
    private double radius=1.0;
    Circle(){
        this.radius=1.0;
    }
    Circle(double radius,String color,boolean filled){
        super(color,filled);
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getArea(){
        double r=this.getRadius();
        return 3.14*r*r;
    } 
    public double getPerimeter(){
        double r=this.getRadius();
        return 2*3.14*r;
    }
    @Override
    public String toString(){
        return("A circle with radius "+radius+" ,which is a subclase of "+super.toString());
    }
}
