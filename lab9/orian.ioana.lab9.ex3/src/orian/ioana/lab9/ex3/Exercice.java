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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.io.*;
import java.io.FileReader;
import java.util.*;

public class Exercice extends JFrame{

    HashMap accounts = new HashMap();

    JLabel file;
    JTextField tFile;
    JTextArea tArea;
    JButton bLoghin;

     Exercice(){

        accounts.put("text.txt","text.txt");

        setTitle("Test login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        init();
        setSize(200,300);
        setVisible(true);
    }

    public void init(){

        this.setLayout(null);
        int width=80;int height = 20;

        file = new JLabel("Nume Fisier ");
        file.setBounds(10, 50, width, height);

        tFile = new JTextField();
        tFile.setBounds(80,50,width, height);

        bLoghin = new JButton("Load");
        bLoghin.setBounds(50,90,width, height);

        bLoghin.addActionListener(new TratareButonLoghin());

        tArea = new JTextArea();
        tArea.setBounds(15,130,150,80);

        add(file);
        add(tFile);
        add(bLoghin);
        add(tArea);

    }


    public static void main(String[] args)  {

        new  Exercice();
    }

    class TratareButonLoghin implements ActionListener {

        private String c="";

        public void citire()throws Exception{
            FileReader f=new FileReader("D:\\FACULTATE_ANUL2\\Semestrul 2\\ISP\\lab9\\orian.ioana.lab9.ex3\\text.txt");
            int i,count=0;
            String c="" ;
            while((i=f.read())!= -1){
                this.c = this.c + (char)i;
            }
        }

        public void actionPerformed(ActionEvent e) {

              String name = Exercice.this.tFile.getText();

            if( Exercice.this.accounts.containsKey(name)){
                String nameFile = (String) Exercice.this.accounts.get(name);
                if(nameFile.equals(tFile)==false){
                    try {
                        citire();
                        Exercice.this.tArea.append(this.c+"\n");
                    } catch (Exception e1) {
                       e1.printStackTrace();
                    }

                }
            }else{
                 Exercice.this.tArea.append("File not found\n");
            }

        }
    }
}
