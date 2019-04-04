package orian.ioana.lab5.ex1;

public class Square extends Rectangle {
    
    private double side;
    public Square(){
        this.side=1;
    }
    public Square(double side){
        this.side=side;
    }
    public Square(double side,String color,boolean filled){
        super(side,side,color,filled);
        this.side=side;
    }
    public double getSide(){
        return this.side;
    }
    public void setSide(double side){
        this.side=side;
    }
    @Override
    public void setWidth(double side){
        this.width=side;
    }
    @Override
    public void setLength(double side){
        this.length=side;
    }
    @Override
    public String toString(){
       return "a square with side: " +this.side+" having filled: " + this.filled;
    }
    
    
    
}
