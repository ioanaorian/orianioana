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
public class Simulator {
    public static void main(String[] args) {
        new Interface();
   /*
        //build station Cluj-Napoca
        Controler c1 = new Controler("Cluj-Napoca");

        Segment s1 = new Segment(1);
        Segment s2 = new Segment(2);
        Segment s3 = new Segment(3);
        //for the station "Cluj-Napoca adds 3 segments that we can control
        c1.addControlledSegment(s1);//adds in the list the controlled segments of that station
        c1.addControlledSegment(s2);
        c1.addControlledSegment(s3);

        //build station Bucuresti
        Controler c2 = new Controler("Bucuresti");

        Segment s4 = new Segment(4);
        Segment s5 = new Segment(5);
        Segment s6 = new Segment(6);

        c2.addControlledSegment(s4);
        c2.addControlledSegment(s5);
        c2.addControlledSegment(s6);

        Controler c3=new Controler("Iasi");
        Segment s7=new Segment(7);
        Segment s8=new Segment(8);
        Segment s9=new Segment (9);

        c3.addControlledSegment(s7);
        c3.addControlledSegment(s8);
        c3.addControlledSegment(s9);
        //connect the 2 controllers=> there is gone be a route Cluj-Napoca->Bucuresti and  Bucuresti->Cluj-Napoca
        c1.setNeighbourController(c2);
        // c2.setNeighbourController(c1);
        //Cluj-Napoca->Iasi and reverse
        //c1.setNeighbourController(c3);
        // c3.setNeighbourController(c1);
        //Bucuresti->Iasi
        c2.setNeighbourController(c3);

        //testing
        //Introducing a train on route Cluj-Napoca->Bucuresti
        Train t1 = new Train("Bucuresti", "IC-001");
        s1.arriveTrain(t1);
        //introduces a train on route CLuj-Napoca->Bucuresti
        Train t2 = new Train("Cluj-Napoca","R-002");
        s5.arriveTrain(t2);
        //I introduced a train  to Iasi
        Train t3=new Train("Iasi","IC-0003");
        s9.arriveTrain(t3);

        //Displays on which segment the trains are
        c1.displayStationState();
        c2.displayStationState();
        c3.displayStationState();


        //execute 4 times controller steps
        for(int i = 0;i<4;i++){
            c1.controlStep();
            c2.controlStep();
            c3.controlStep();

            System.out.println();

            c1.displayStationState();
            c2.displayStationState();
            c3.displayStationState();
        }*/
    }
}

