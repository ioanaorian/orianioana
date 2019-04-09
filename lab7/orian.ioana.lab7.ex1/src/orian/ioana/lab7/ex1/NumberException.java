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
public class NumberException extends Exception {
    
    int number;
    public NumberException(int number,String msg){
        super(msg);
        this.number=number;
    }
    int getNumber(){
        return number;
    }
    public void setNumer(){
        this.number++;
    }
}
