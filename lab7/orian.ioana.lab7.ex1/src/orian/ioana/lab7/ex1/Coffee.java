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
public class Coffee {
    
    private int temp;
    private int conc;
    Coffee(int t,int c ){
        temp=t;
        conc=c;
    }
    int getTemp(){
        return temp;
    }
    int getConc(){
        return conc;
    }
    @Override
    public String toString(){
        return "[coffee temperature="+temp+":concentration="+conc+"]";
    }
}


