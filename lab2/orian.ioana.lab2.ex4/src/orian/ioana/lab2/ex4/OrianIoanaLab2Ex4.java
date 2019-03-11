package orian.ioana.lab2.ex4;

import java.util.*;

public class OrianIoanaLab2Ex4 {

    public static void main(String[] args) {

        Random r = new Random();
        int[] vector = new int[10];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = r.nextInt(100);
        }
        for (int i = 0; i < vector.length; i++) {
            System.out.println("vector[" + i + "]=" + vector[i] + " ");
        }
        int max = vector[0];
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > max) {
                max = vector[i];
            }
        }
        System.out.println("Maximul= " + max);
    }

}
