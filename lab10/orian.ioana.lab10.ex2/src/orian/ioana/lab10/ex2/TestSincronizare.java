/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orian.ioana.lab10.ex2;

/**
 *
 * @author Alexandra
 */
public class TestSincronizare {
public static void main(String[] args) {
    Punct p = new Punct();
    FirSet fs1 = new FirSet(p);
    FirGet fg1 = new FirGet(p);
 
    fs1.start();
    fg1.start();
}
}

