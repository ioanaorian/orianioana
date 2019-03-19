package orian.ioana.lab4.ex6;

public class Shape {

   private String color="red";
   private boolean filled=true;
   Shape(){
       this.color="green";
       this.filled=true;
   }
   Shape(String color,boolean filled){
       this.color=color;
       this.filled=filled;
   }
   public String getColor(){
       return color;
   }
   public void setColor(String color){
       this.color=color;
   }
   public boolean isFILLED(){
       return filled;
   }
   public void setFilled(boolean filled){
       this.filled=filled;
   }
   @Override
   public String toString(){
       if(this.isFILLED()==true){
           return("A shape with color of "+color+" and "+"filled");
       }
       else{
            return("A shape with color of "+color+" and "+"not filled");
       }
   }
    
}
