package orian.ioana.lab2.ex2.varianta1;

import java.util.Scanner;

public class OrianIoanaLab2Ex2Varianta1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti numrul: ");
        int nr = in.nextInt();
        if (nr == 0) {
            System.out.println("Zero");
        } else if (nr == 1) {
            System.out.println("One");
        } else if (nr == 2) {
            System.out.println("Two");
        } else if (nr == 3) {
            System.out.println("Three");
        } else if (nr == 4) {
            System.out.println("Four");
        } else if (nr == 5) {
            System.out.println("Five");
        } else if (nr == 6) {
            System.out.println("Six");
        } else if (nr == 7) {
            System.out.println("Seven");
        } else if (nr == 8) {
            System.out.println("Eight");
        } else if (nr == 9) {
            System.out.println("Nine");
        } else if (nr > 9) {
            System.out.println("Other");
        }

    }

}
