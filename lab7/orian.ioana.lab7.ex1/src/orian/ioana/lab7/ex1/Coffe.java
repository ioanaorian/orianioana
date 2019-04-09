/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orian.ioana.lab7.ex1;

/**
 *
 * @author Alexandra
 */
public class Coffe {
    private int temp;
     private int conc;
     private static int number;
      public Coffe(int t,int c){temp = t;conc = c;number++;}
      int getTemp(){return temp;}
      int getConc(){return conc;}
      int getNumber(){
          return number;
      }
      @Override
      public String toString(){return "[cofee temperature="+temp+":concentration="+conc+"]";}
}
