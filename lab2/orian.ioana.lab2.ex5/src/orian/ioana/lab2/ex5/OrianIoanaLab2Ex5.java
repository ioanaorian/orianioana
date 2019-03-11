package orian.ioana.lab2.ex5;

import java.util.*;

public class OrianIoanaLab2Ex5 {

    static void bubbleSort(int[] vector) {
        int n = vector.length;
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (vector[j - 1] > vector[j]) {
                    //swap elements  
                    temp = vector[j - 1];
                    vector[j - 1] = vector[j];
                    vector[j] = temp;
                }

            }
        }

    }

    public static void main(String[] args) {

        Random r = new Random();
        int[] vector = new int[10];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = r.nextInt(100);
        }
        for (int i = 0; i < vector.length; i++) {
            System.out.println("vector[" + i + "]=" + vector[i] + " ");
        }

        System.out.println();

        bubbleSort(vector);
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }

    }

}
