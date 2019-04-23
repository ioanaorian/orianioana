/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orian.ioana.lab9.ex2;

import java.awt.FlowLayout;     
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ButtonAndTextField implements ActionListener {

    JButton Btn = new JButton("Click");
    JFrame frm = new JFrame();
    JTextField display = new JTextField(15);

    int i = 0;


    public ButtonAndTextField() {

        display.setText("" + i);
        frm.setVisible(true);
        frm.setSize(200, 100);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setResizable(true);
        frm.setLayout(new FlowLayout());
        frm.add(display);
        frm.add(Btn);
        Btn.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == Btn) {
            i++;
            display.setText("" + i);
        }

    }

    public static void main(String args[]) {
        new ButtonAndTextField();
    }
      
   
}
