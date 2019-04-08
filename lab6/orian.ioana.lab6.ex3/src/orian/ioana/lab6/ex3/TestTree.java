/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orian.ioana.lab6.ex3;

/**
 *
 * @author Alexandra
 */

public class TestTree {
    public static void main(String[] args){
        Bank b=new Bank();
        b.addAccount("owner1",112.32);
        b.addAccount("owner2",356.95);
        b.addAccount("owner3",788.12);
        System.out.println("All accounts");
        b.printAccounts();
        System.out.println();
        b.printAccounts(300,800);
    }
}

