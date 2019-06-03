/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orian.ioana.lab12.ex2;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Alexandra
 */
public class Stock extends JFrame {

    /**
     * @param args the command line arguments
     */
    JTextArea view_available_products;
    JTextField add_product_name;
    JTextField add_product_quantity;
    JTextField add_product_price;
    JButton add_new_product;
    JButton delete_product;
    JButton change_product_available_quantity;
    
    Stock(){
        
        setTitle("Stock");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        init();
        setSize(200,300);
        setVisible(true);
        
    }
    
    public void init(){
        
        this.setLayout(null);
        int width=80;int height = 20;
        
        view_available_products=new JArea("Available_product");
        
    }
    
    
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
