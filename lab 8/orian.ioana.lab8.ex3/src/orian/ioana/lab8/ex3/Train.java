/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orian.ioana.lab8.ex3;

/**
 *
 * @author Alexandra
 */
public class Train {
    private String destination;
    private String name;

    public Train(String destinatie, String nume) {
        super();
        this.destination = destinatie;
        this.name = nume;
    }

    public String getDestination() {
        return destination;
    }

    public String getName() {
        return name;
    }
}

