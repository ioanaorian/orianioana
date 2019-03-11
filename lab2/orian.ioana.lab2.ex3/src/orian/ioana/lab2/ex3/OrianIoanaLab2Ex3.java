package orian.ioana.lab2.ex3;

import java.util.*;

public class OrianIoanaLab2Ex3 {

    static int prim(int x) {
        if (x == 0 || x == 1) {
            return 0;
        }
        for (int i = 2; i <= x / 2; i++) {
            if (x % i == 0) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("a= ");
        int a = in.nextInt();
        System.out.println("b= ");
        int b = in.nextInt();
        System.out.println(" ");
        int n = 0;//contor numere prime
        for (int i = a; i <= b; i++) {
            if (prim(i) == 1) {
                System.out.println(i + " ");
                n++;
            }
        }
        System.out.println(n + " numere prime");
    }

}
