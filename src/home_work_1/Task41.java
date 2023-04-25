package home_work_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task41 {
    public static void main(String[] args) {
        double a;
        Scanner in;
        while (true) {
            in = new Scanner(System.in);
            try {
                System.out.println("Ввод числа : ");
                a = in.nextDouble();
                break;
            }
            catch (InputMismatchException e) {
                System.out.println("Wrong value, repeat!");
            }
        }
        if (a % 2 == 0) {
            System.out.println("Введенное число: четное");
        } else System.out.println("Введённое число: нечетное");

    }
}
