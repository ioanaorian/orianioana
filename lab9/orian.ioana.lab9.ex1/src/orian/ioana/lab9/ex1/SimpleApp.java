/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orian.ioana.lab9.ex1;

import javax.swing.JFrame;
 
public class SimpleApp extends JFrame{
   
    SimpleApp(){
            setTitle("Titlul ferestrei");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(400,500);
            setVisible(true);
      }
 
      public static void main(String[] args) {
            SimpleApp a = new SimpleApp();
      }
 
}