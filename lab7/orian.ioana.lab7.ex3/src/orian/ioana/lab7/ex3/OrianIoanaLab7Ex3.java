/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orian.ioana.lab7.ex3;

/**
 *
 * @author Alexandra
 */
import java.io.*;
import java.util.Scanner;

public class OrianIoanaLab7Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        System.out.println("Choose the operation 1-enc 2-dec");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 1) {
            PrintWriter writer = new PrintWriter("D:\\FACULTATE_ANUL2\\Semestrul 2\\ISP\\lab7\\orian.ioana.lab7.ex3\\text.enc", "UTF-8");
            FileReader fr = new FileReader("D:\\FACULTATE_ANUL2\\Semestrul 2\\ISP\\lab7\\orian.ioana.lab7.ex3\\new.txt");
            int i;
            char c = (char) System.in.read();
            while ((i = fr.read()) != -1) {
                writer.print((char) (i + 1));
            }
            writer.close();
        }
        if (n == 2) {
            PrintWriter writer = new PrintWriter("D:\\FACULTATE_ANUL2\\Semestrul 2\\ISP\\lab7\\orian.ioana.lab7.ex3\\text.dec", "UTF-8");
            FileReader fr = new FileReader("D:\\FACULTATE_ANUL2\\Semestrul 2\\ISP\\lab7\\orian.ioana.lab7.ex3\\new.enc");
            int i;
            char c = (char) System.in.read();
            while ((i = fr.read()) != -1) {
                writer.print((char) (i - 1));
            }
            writer.close();
        }
    }

}
