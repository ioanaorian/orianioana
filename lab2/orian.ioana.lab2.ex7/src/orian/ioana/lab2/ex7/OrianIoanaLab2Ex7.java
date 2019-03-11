package orian.ioana.lab2.ex7;

import java.util.*;

public class OrianIoanaLab2Ex7 {

    public static void main(String[] args) {

        int n, number, i = 1;
        Random r = new Random();
        n = r.nextInt(100);
        System.out.println(n);
        Scanner in = new Scanner(System.in);

        switch (i) {
            case 1:
                System.out.println("Guess the number: ");
                number = in.nextInt();
                if (number == n) {
                    System.out.println("You win");
                    break;
                } else if (number < n) {
                    System.out.println("Wrong answer,your number is too low");
                } else if (number > n) {
                    System.out.println("Wrong answer,your number is too high");
                }
                i++;
            case 2:
                System.out.println("Guess the number: ");
                number = in.nextInt();
                if (number == n) {
                    System.out.println("You win");
                    break;
                } else if (number < n) {
                    System.out.println("Wrong answer,your number is too low");
                } else if (number > n) {
                    System.out.println("Wrong answer,your number is too high");
                }
                i++;
            case 3:
                System.out.println("Guess the number: ");
                number = in.nextInt();
                if (number == n) {
                    System.out.println("You win");
                    break;
                } else if (number < n) {
                    System.out.println("Wrong answer,your number is too low");
                } else if (number > n) {
                    System.out.println("Wrong answer,your number is too high");
                }
                i++;
            case 4:
                System.out.println("You lost");
                break;

        }
    }
}
