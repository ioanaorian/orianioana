/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orian.ioana.lab9.ex5;

/**
 *
 * @author Alexandra
 */

import javax.swing.*;

public class Interface extends JFrame {
    protected static JTextArea display;
    protected static JButton btn;
    private JLabel text;
    private JLabel dest;
    private JLabel segm;
    private JLabel stat;
    private JLabel tren;
    protected static JTextField destination;
    protected static JTextField segment;
    protected static JTextField station;
    protected static JTextField train;

    protected static int trains;
    protected static Train[] t = new Train[9];
    //build station Cluj-Napoca
   protected static Controler c1 = new Controler("Cluj-Napoca");
    Segment s1 = new Segment(1);
    Segment s2 = new Segment(2);
    Segment s3 = new Segment(3);

    //build station Bucuresti
    protected static Controler c2 = new Controler("Bucuresti");
    Segment s4 = new Segment(4);
    Segment s5 = new Segment(5);
    Segment s6 = new Segment(6);

    //build station Iasi
   protected static  Controler c3 = new Controler("Iasi");
    Segment s7 = new Segment(7);
    Segment s8 = new Segment(8);
    Segment s9 = new Segment(9);


    public Interface() {
        int trains=0;
        setTitle("Train");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        init();
        setSize(700, 600);
        setVisible(true);

        c1.addControlledSegment(s1);//adds in the list the controlled segments of that station
        c1.addControlledSegment(s2);
        c1.addControlledSegment(s3);
        c2.addControlledSegment(s4);
        c2.addControlledSegment(s5);
        c2.addControlledSegment(s6);
        c3.addControlledSegment(s7);
        c3.addControlledSegment(s8);
        c3.addControlledSegment(s9);

        //Cluj-Napoca->Bucuresti and reverse
        c1.setNeighbourController(c2);
        c2.setNeighbourController(c1);
        //Cluj-Napoca->Iasi and reverse
        c1.setNeighbourController(c3);
        c3.setNeighbourController(c1);
        //Bucuresti->Iasi
        c2.setNeighbourController(c3);
        c3.setNeighbourController(c2);



    }

    public void init() {
        int x=540;
        this.setLayout(null);
        display = new JTextArea();
        display.setBounds(20, 50, 500, 400);
        add(display);
        text = new JLabel();
        text.setText("Display");
        text.setBounds(20, 10, 50, 50);
        add(text);


        dest = new JLabel();
        dest.setBounds(x, 50, 140, 20);
        dest.setText("Destination");
        add(dest);
        destination = new JTextField();
        destination.setBounds(x, 80, 90, 20);
        add(destination);

        segm = new JLabel();
        segm.setBounds(x, 110, 140, 20);
        segm.setText(" On Segment");
        add(segm);
        segment = new JTextField();
        segment.setBounds(x, 140, 90, 20);
        add(segment);

        tren=new JLabel();
        tren.setBounds(x,170,140,20);
        tren.setText("Train");
        add(tren);
        train = new JTextField();
        train.setBounds(x, 200, 90, 20);
        add(train);

        stat=new JLabel();
        stat.setBounds(x,230,140,20);
        stat.setText(" Current Station");
        add(stat);
        station = new JTextField();
        station.setBounds(x, 260, 90, 20);
        add(station);




        btn = new JButton();
        btn.setBounds(x, 290, 70, 20);
        btn.setText("Add");
        add(btn);
        btn.addActionListener(new Action());
    }

    public static void show(String s) {
        display.append(s + "\n");
    }
}

