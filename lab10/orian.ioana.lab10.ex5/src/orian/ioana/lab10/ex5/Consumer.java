/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orian.ioana.lab10.ex5;

/**
 *
 * @author Alexandra
 */
class Consumer extends Thread
{
      private Buffer bf;
      Consumer(Buffer bf){this.bf=bf;}
 
      public void run()
      {
            while (true)
            {
                  System.out.println("Am citit : "+this+" >> "+bf.get());
            }
      }
}