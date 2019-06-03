/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orian.ioana.lab12.ex1;

/** 
 *
 * @author Alexandra
 */
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.util.*;

class Interfata extends Thread {
    JTextField senzor;
    JFrame f=new JFrame();
    Interfata(){
        f.setTitle("Senzor");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        init();
        f.setSize(200,300);
        f.setVisible(true);

        senzor.setText("");
    }
    public void init(){
        this.f.setLayout(null);
        int width=80;
        int height=20;
        senzor=new JTextField();
        senzor.setBounds(50,50,width,height);
        f.add(senzor);
    }
    Random r = new Random();
    public void run(){
        for(int i=0;i<20;i++) {
            int n=r.nextInt(100);
            if(n>50){
                n=50-n;
            }
            senzor.setText(""+n);
            try {
                Thread.sleep((int) ( 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args){
        Interfata ss=new Interfata();
        ss.start();
    }
}