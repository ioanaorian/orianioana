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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
            CoffeeMaker mk = new CoffeeMaker();
            CoffeeDrinker d = new CoffeeDrinker();
 
            for(int i = 0;i<15;i++){
                   Coffee c=null;
                  try 
                  {
                      c = mk.makeCoffee();
                  } 
                  catch (PredefinedNumberException e) 
                  {
                      System.out.println("Exception:"+e.getMessage()+" cups of coffee="+e.getContor());
                  }
                  finally
                  {
                        System.out.println("Throw the cofee cup.\n");
                  }
                  if(c!=null)
                  try 
                  {
                        d.drinkCoffee(c);
                  } 
                  catch (TemperatureException e) 
                  {
                        System.out.println("Exception:"+e.getMessage()+" temp="+e.getTemp());
                  } 
                  catch (ConcentrationException e) 
                  {
                        System.out.println("Exception:"+e.getMessage()+" conc="+e.getConc());
                  }
                  finally
                  {
                        System.out.println("Throw the cofee cup.\n");
                  }
            }    
      }
}
