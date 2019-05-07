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
public class Train {
    String destination;
    String name;

    public Train(String destinatie, String nume) {
        super();
        this.destination = destinatie;
        this.name = nume;
    }

    String getDestination(){
        return destination;
    }
}


