/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orian.ioana.lab10.ex2;

/**
 *
 * @author Alexandra
 */
   
class FirGet extends Thread {
    Punct p;
 
    public FirGet(Punct p){
        this.p = p;
    }
 
    public void run(){
        int i=0;
        int a,b;
        while(++i<15){         
           synchronized(p){
            a= p.getX();          
            try {
                sleep(50);
            } catch (InterruptedException e) {  
                e.printStackTrace();
            }         
            b = p.getY();
            }
            System.out.println("Am citit: ["+a+","+b+"]");
        }
    }
}//.class
 
