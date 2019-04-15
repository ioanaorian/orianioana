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

class ConcentrationException extends Exception{
      int c;
      public ConcentrationException(int c,String msg) {
            super(msg);
            this.c = c;
      }
 
      int getConc(){
            return c;
      }
}