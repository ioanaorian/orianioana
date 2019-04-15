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
public class PredefinedNumberException extends Exception {
    
    int contor;
    public PredefinedNumberException(int contor,String msg){
        super(msg);
        this.contor=contor;
    }
    int getContor(){
        return contor;
    }
    
}
