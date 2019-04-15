/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orian.ioana.lab7.ex4;

import java.io.*;

/**
 *
 * @author Alexandra
 */
public class CarFactory {
    
      Car createCar(int model,int price){
            Car c = new Car(model,price);
            System.out.println(c+" is created.");
            return c;
      }
      
       void freezCar(Car a, String storeRecipientName) throws IOException{
            ObjectOutputStream o =
              new ObjectOutputStream(
                new FileOutputStream(storeRecipientName));
 
            o.writeObject(a);
            System.out.println(a+":I'll be back.");
      }
       
       Car unfreezCar(String storeRecipientName) throws IOException, ClassNotFoundException{
             ObjectInputStream in =
                    new ObjectInputStream(
                      new FileInputStream(storeRecipientName));
             Car x = (Car)in.readObject();
             System.out.println(x+":I'm back.");
             return x;
      } 
      
}
