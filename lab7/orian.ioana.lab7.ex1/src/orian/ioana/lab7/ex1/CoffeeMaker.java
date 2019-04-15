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

public class CoffeeMaker {
    
    int contor=0;
    
    Coffee makeCoffee() throws PredefinedNumberException{
        System.out.println("Make a coffee");
        int t=(int)(Math.random()*100);
        int c=(int)(Math.random()*100);
        contor++;
        Coffee coffee=new Coffee(t,c);
        if(contor>3){
            throw new PredefinedNumberException(contor,"Too much coffee");
        }
        return coffee;
    }
    int getContor(){
        return contor;
    }
    
}