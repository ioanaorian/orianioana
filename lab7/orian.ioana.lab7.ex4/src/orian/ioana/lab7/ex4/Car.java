/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orian.ioana.lab7.ex4;

/**
 *
 * @author Alexandra
 */
import java.io.*;

public class Car implements Serializable {
    
    public int model;
    public int price;
    public Car(int model,int price){
        this.model=model;
        this.price=price;
    }
    @Override
    public String toString(){
        return "[car="+model+":price="+price+"]";
    }
    
}
