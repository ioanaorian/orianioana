package orian.ioana.lab4.ex6;

public class Square extends Rectangle {
    
    private double side;
    
    Square(){
        this.side=10;
    }
    Square(double side){
        super(side,side);
        this.side=side;
    }
    Square(double side,String color,boolean filled){
        super(side,side,color,filled);
        this.side=side;
    } 
    public double getSide(){
        return side;
    }
    public void setSide(double side){
        this.side=side;
     }
    @Override
    public void setLength(double side){
        this.side=side;
    }
    @Override
    public void setWidth(double side){
        this.side=side;
    }
    @Override
    public String toString(){
        return ("A square with side= "+getSide()+" ,which is subclss of "+super.toString());
    }

    
}
