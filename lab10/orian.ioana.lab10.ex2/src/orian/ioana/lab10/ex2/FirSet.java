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
class FirSet extends Thread {
    Punct p;
    public FirSet(Punct p){
        this.p = p;
    } 
    public void run(){
        int i =0;
        while(++i<15){
            int a = (int)Math.round(10*Math.random()+10);
            int b = (int)Math.round(10*Math.random()+10);
 
            synchronized(p){
            p.setXY(a,b);
             }
 
            try {
                sleep(10);
            } catch (InterruptedException e) {
 
                e.printStackTrace();
            }
            System.out.println("Am scris: ["+a+","+b+"]");
        }
    }
}//.class
