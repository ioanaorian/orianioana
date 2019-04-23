/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orian.ioana.lab9.ex3;

/**
 *
 * @author Alexandra
 */
import java.awt.FlowLayout;     
import javax.swing.*; 
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Sala 310
 */
public class OrianIoanaLab9Ex3 implements ActionListener{
    JButton btn = new JButton("File ");
    JTextField tf1 = new JTextField("TextField1");
    JTextArea area = new JTextArea("TextArea");
    JFrame frame1 = new JFrame();
    public OrianIoanaLab9Ex3(){
    frame1.setVisible(true);
    frame1.setSize(500,400);
    frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame1.setResizable(true);
    frame1.setLayout(new FlowLayout());
    area.setSize(300,150);
    frame1.add(btn);
    frame1.add(tf1);
    frame1.add(area);
    
}
    
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == btn) {
            
            
        }

    }
     public static void main(String args[]) {
        new OrianIoanaLab9Ex3();
    }
}
