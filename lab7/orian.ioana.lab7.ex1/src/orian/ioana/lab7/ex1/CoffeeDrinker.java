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
    
    void drinkCoffee(Coffee c) throws TemperatureException,ConcentrationException{
        if(c.getTemp()>60)
            throw new TemperatureException(c.getTemp(),"Coffee is to hot!");
        if(c.getConc()>50)
            throw new ConcentrationException(c.getConc(),"Coffee concentration too high");
        System.out.println("Drink coffee:"+c);
    }
}
