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
          //static  int contor=0;
          Coffe makeCoffee() throws Exception {                
            System.out.println("Make a coffe");
            int t = (int)(Math.random()*100); 
            int c = (int)(Math.random()*100);
            //if(contor>3) throw new Exception("Max number of coffees exceeded!");
            Coffe cofee = new Coffe(t,c);
            //contor++; 
            return cofee;
      }  
          
}
