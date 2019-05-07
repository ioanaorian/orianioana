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
class Producer implements Runnable
{
      private Buffer bf;
      private Thread thread;
      Producer(Buffer bf){this.bf=bf;}
 
      public void start()
      {
            if (thread==null)
            {
                  thread = new Thread(this);
                  thread.start();
            }
      }
 
      public void run()
      {
            while (true)
            {
                  bf.push(Math.random());
                  System.out.println("Am scris.");
                  try
                  {Thread.sleep(1000);}catch(Exception e){}
            }
      }
}
 