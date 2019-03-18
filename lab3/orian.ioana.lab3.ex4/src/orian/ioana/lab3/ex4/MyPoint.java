package orian.ioana.lab3.ex4;


public class MyPoint {
    
    public int x;
    public int y;
    MyPoint(){
        this.x=0;
        this.y=0;
    }
    MyPoint(int x,int y){
        this.x=x;
        this.y=y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }
    public void setXY(int x,int y){
        this.x=x;
        this.y=y;
    }
    @Override
    public String toString(){
        return("("+x+","+y+")");
    }
    
}
