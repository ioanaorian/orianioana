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
public class CoffeeDrinker {
    void drinkCoffee(Coffe c) throws TemperatureException, ConcentrationException,NumberException{
            if(c.getTemp()>60)
                  throw new TemperatureException(c.getTemp(),"Cofee is to hot!");
            if(c.getConc()>50)
                  throw new ConcentrationException(c.getConc(),"Cofee concentration to high!");         
            System.out.println("Drink cofee:"+c);
            if(c.getNumber()>3) throw new NumberException(c.getNumber(),"Max number of coffees exceeded!");
      }
}

