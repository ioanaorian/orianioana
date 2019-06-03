/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orian.ioana.lab12.ex1;

import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.xml.bind.Marshaller.Listener;

/**
 *
 * @author Alexandra
 */
public class Senzor_1 extends Thread {
    
        Random r=new Random();
        JFrame f=new JFrame();
        Senzor_1(){
        f.setTitle("Senzor");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        init();
        f.setSize(200,300);
        f.setVisible(true);
    }
         
    public void init(){
        
        f.this.setLayout(null);
        int width=80;int height = 20;
        f= new JTextField();
        f.setBounds(70,50,width, height);
        add(f);
        
    }
    
    public static void main(String[] args) {
            new Senzor();
      }
    
    class TratareTextField implements ActionListener{
    
        public void actionPerformed(ActionEvent e){
            
            String t=Senzor.this.t.getText();
            Senzor.this.t.append();
            
        }
    
}
     
        public void run(){
            
            for(int i=0;i<20;i++){
                   int nr=r.nextInt(100);
                   if(nr<50){
                       nr=nr-50;
                   }
                   Senzor_1.setText=(""+nr);
                  System.out.println(" nr = "+nr);
                  try {
                        Thread.sleep(1000);
                  } catch (InterruptedException e) {
                        e.printStackTrace();
                  }
            }
            
      }
        public static void main(String args[])
      {
            Senzor_1 s=new Senzor_1();
            s.start();
      }
        
}

