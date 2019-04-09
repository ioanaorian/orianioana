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
public class TemperatureException extends Exception {
    int t;
      public TemperatureException(int t,String msg) {
            super(msg);
            this.t = t;
      }
 
      int getTemp(){
            return t;
      }
}
