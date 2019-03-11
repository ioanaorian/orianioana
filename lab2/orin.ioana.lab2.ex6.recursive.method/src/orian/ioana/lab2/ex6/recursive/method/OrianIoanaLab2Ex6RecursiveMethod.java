package orian.ioana.lab2.ex6.recursive.method;

import java.util.*;

public class OrianIoanaLab2Ex6RecursiveMethod {

    static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return (n * factorial(n - 1));
        }
    }

    public static void main(String[] args) {

        int i, fact = 1;
        Scanner in = new Scanner(System.in);
        System.out.println("n: ");
        int n = in.nextInt();
        fact = factorial(n);
        System.out.println(n + "!=" + fact);
    }

}
