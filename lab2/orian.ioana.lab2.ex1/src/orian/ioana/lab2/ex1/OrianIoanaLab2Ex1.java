package orian.ioana.lab2.ex1;

import java.util.Scanner;

public class OrianIoanaLab2Ex1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        if (x > y) {
            System.out.println("Maxim= " + x);
        } else {
            System.out.println("Maxim= " + y);
        }
    }

}
