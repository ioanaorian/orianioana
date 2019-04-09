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
public class CoffeeTest {
    public static void main(String[] args) throws Exception {
            CoffeeMaker mk = new CoffeeMaker(); 
            CoffeeDrinker d = new CoffeeDrinker();
 
            for(int i = 0;i<15;i++){
                  Coffe c = mk.makeCoffee();
                  try {
                        d.drinkCoffee(c);
                  } catch (TemperatureException e) {
                        System.out.println("Exception:"+e.getMessage()+" temp="+e.getTemp());
                  } catch (ConcentrationException e) {
                        System.out.println("Exception:"+e.getMessage()+" conc="+e.getConc());
                  }catch(NumberException e){
                        System.out.println("Exception:"+e.getMessage()+" number="+e.getNumber());
                  }
                  
                  finally{
                        System.out.println("Throw the cofee cup.\n");
                  }
            }    
      }
}
