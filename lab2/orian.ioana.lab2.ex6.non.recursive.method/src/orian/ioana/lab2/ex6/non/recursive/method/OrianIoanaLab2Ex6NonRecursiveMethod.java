package orian.ioana.lab2.ex6.non.recursive.method;

import java.util.*;

public class OrianIoanaLab2Ex6NonRecursiveMethod {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti n: ");
        int n = in.nextInt();
        int i, fact = 1;
        for (i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("n!= " + fact);
    }
}
