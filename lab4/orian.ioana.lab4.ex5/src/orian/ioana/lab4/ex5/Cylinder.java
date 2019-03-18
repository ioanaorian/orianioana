package orian.ioana.lab4.ex5;

public class Cylinder extends Circle{
    
    private double height=1.0;
    Cylinder(){
        super();
        this.height=3.0;
    }
    Cylinder(double radius){
        super(radius);
    }
    Cylinder(double radius,double height){
        super(radius);
        this.height=height;
    }
    public double getHeight(){
        return  height;
    }
    @Override
    public double getArea(){
        double r=this.getRadius();
        double h=this.getHeight();
        return 3.14*r*r+2*3.14*r*h;
    }
    public double getVolume(){
        double r=this.getRadius();
        double h=this.getHeight();
        return 3.14*r*r*h;
    }
    
}
