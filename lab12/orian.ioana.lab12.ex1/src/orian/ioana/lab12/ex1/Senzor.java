/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orian.ioana.lab12.ex1;

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
public class Senzor extends JFrame {

    JTextField t;
    
    Senzor(){
        setTitle("Senzor");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        init();
        setSize(200,300);
        setVisible(true);
    }
         
    public void init(){
        
        this.setLayout(null);
        int width=80;int height = 20;
        t= new JTextField();
        t.setBounds(70,50,width, height);
        add(t);
        
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
    
    
}
