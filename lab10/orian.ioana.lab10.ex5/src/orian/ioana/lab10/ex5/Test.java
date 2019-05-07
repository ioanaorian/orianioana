/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orian.ioana.lab10.ex5;

/**
 *
 * @author Alexandra
 */
public class Test {
    public static void main(String[] args){
        Buffer b = new Buffer();
            Producer pro = new Producer(b);
            Consumer c = new Consumer(b);
            Consumer c2 = new Consumer(b);
            //Lanseaza cele 3 fire de executie. Se observa ca cele 3 fire de executie
            // folosesc in comun obiectul b de tip Buffer. Exista un fir pro ce este
            // responsabil cu adaugarea de elemente in buffer si doua obiecte
            // responsabile cu extragerea elementelor din buffer.
            pro.start();
            c.start();
            c2.start();
    }
}
