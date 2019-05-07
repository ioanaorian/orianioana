/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orian.ioana.lab10.ex3;

/**
 *
 * @author Alexandra
 */

    /**
  public class OrianIoanaLab10Ex3 {

    /**
     * @param args the command line arguments
     */
public class Counters extends Thread {
    public int start;
    public int end;
    Counters(String name){
            super(name);
      }
    
    Counters(String name, int start,int end)
    {
        super(name);
        this.start=start;
        this.end=end;
    }
 
      public void start(){
            for(int i=start;i<end;i++){
                  System.out.println(getName() + " i = "+i);
                  try {
                        Thread.sleep(50);
                  } catch (InterruptedException e) {
                        e.printStackTrace();
                  }
            }
            System.out.println(getName() + " job finalised.");
      }
 
      public static void main(String[] args) {
            Counters c1 = new Counters("counter1",0,100);
            Counters c2 = new Counters("counter2",100,200);
  
 
            c1.start();
            c2.start();
            
      }
    
}
