package home_work_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task43 {
    public static void main(String[] args) {
        Scanner in;
        double a;
        double b;
        while (true) {
            in = new Scanner(System.in);
            try {
                System.out.println("Первое число: ");
                a = in.nextDouble();
                System.out.println("Второе число: ");
                b = in.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Wrong value, repeat!");
            }
        }
        if (a%b==0)
            System.out.println("Первое число делится нацело на второе");
        else if (b%a==0)
            System.out.println("Второе число делится нацело на первое");
             else System.out.println("Числа не делятся друг на друга");

    }
}
