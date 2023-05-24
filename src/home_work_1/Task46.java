package home_work_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task46 {
    public static void main(String[] args) {
        Scanner in;
        int year;
        while (true) {
            in = new Scanner(System.in);
            try {
                System.out.println("Определение года на високосность. Введите год : ");
                year = in.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Wrong value, repeat!");
            }
        }
        whatYear(year);
    }
    public static String whatYear(int year ) {
        if (year%4 != 0) {
            System.out.println("Обычный год");
            return "Обычный год";
        } else if (year%100 ==0 && year%400 == 0) {
                System.out.println("Обычный год");
                return "Обычный год";
            } else {
            System.out.println("Високосный год");
            return "Високосный год";
            }
    }
}



