/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orian.ioana.lab5.ex1;

public class Circle extends Shape {
    protected double radius;
    
    @Override
    public double getPerimeter()
    {
        return 2*Math.PI*this.radius;
    }
    
    @Override
    public double getArea()
    {
        return Math.PI*this.radius*this.radius;
    }
    
    public Circle()
    {
        this.radius=1;
    }
    
    public Circle(double radius)
    {
        this.radius=radius;
    }
    
    public Circle(double radius, String color,boolean filled)
    {
        super(color,filled);
        this.radius=radius;
     }
    
    
    public double getRadius()
    {
        return this.radius;
    }
    
    public void setRadius(double radius)
    {
        this.radius=radius;
    }
    
   @Override
   public String toString()
   {
       return "a circle with radius: " +this.radius + " is " + super.toString();
   }
           
    
    
}
