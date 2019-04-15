/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orian.ioana.lab7.ex2;

import java.io.*;

/**
 *
 * @author Alexandra
 */
public class OrianIoanaLab7Ex2 {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("D:\\FACULTATE_ANUL2\\Semestrul 2\\ISP\\lab7\\orian.ioana.lab7.ex2\\text.txt");
        int i, count = 0;
        char c = (char) System.in.read();
        while ((i = fr.read()) != -1) {
            if ((char) i == c) {
                count++;
            }
        }
        System.out.println(count);
    }
}
