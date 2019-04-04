package orian.ioana.lab5.ex1;

public class Rectangle extends Shape {
    
    protected double width;
    protected double length;
    
    Rectangle(){
        this.width=1;
        this.length=2;
    }
    Rectangle(double width,double length){
        this.width=width;
        this.length=length;
    }
    Rectangle(double width,double length,String color,boolean filled){
        this.width=width;
        this.length=length;
        this.color=color;
        this.filled=filled;
    }
    
    double getWidth(){
        return this.width;
    }
    double getLength(){
        return this.length;
    }
    public void setWidth(double width){
        this.width=width;
    }
    public void setLength(double length){
        this.length=length;
    }
    
    @Override
    double getArea(){
        double w = this.getWidth();
        double l = this.getLength();
        return w * l;
    }
    
    @Override
    double getPerimeter(){
        double w = this.getWidth();
        double l = this.getLength();
        return 2 * (w + l);
    }
    
    @Override
   public String toString()
   {
       return "a rectangle with width: " +this.width +"and length "+this.length+ "is " + super.toString();
   }
    
}
