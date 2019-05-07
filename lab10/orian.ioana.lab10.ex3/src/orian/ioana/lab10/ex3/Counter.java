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
public class Counter extends Thread {
    public int start;
    public int end;
    Thread t;
    
    Counter(String name, int start,int end,Thread t)
    {
        super(name);
        this.start=start;
        this.end=end;
        this.t=t;
    }
 
      public void run(){
            try
            {                
                  if (t!=null) t.join();
                  for(int i=start;i<end;i++){
                        System.out.println(getName() + " i = "+i);
                  }
                  Thread.sleep(3000);
                  System.out.println(getName() + " job finalised.");
            } catch(Exception e){e.printStackTrace();} 
            }
 
 
      public static void main(String[] args) {
            Counter c1 = new Counter("counter1",0,100,null);
            Counter c2 = new Counter("counter2",100,200,c1);
  
 
            c1.start();
            c2.start();
            
      }
    
}
