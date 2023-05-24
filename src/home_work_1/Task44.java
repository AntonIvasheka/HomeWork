package home_work_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task44 {
    public static void main(String[] args) {
        int choice;
        Scanner in;
        double number;
        double res;
        while (true) {
            in = new Scanner(System.in);
            try {
                System.out.println("Какое действиие будем делать(байты в килобайты - 1; килобайты в байты - 2): ");
                choice = in.nextInt();
                System.out.println("Численное значение (б/кб): ");
                number = in.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Wrong value, repeat!");
            }
        }   // Можно проверку на значение выбора запилить и ввод байтов ограничить вещественным числом,
        // при умножении которого на 8 (т.е. переводом в биты) получалось число без вещественной части.
        calc(choice, number);
    }
    public static double calc(int choice, double number) {
        if (choice == 1) {
            System.out.println("Результат перевода в кб : " + number / 1024);
            return (number / 1024);
        } else if (choice == 2) {
            System.out.println("Результат перевода в байты : " + number * 1024);
            return (number * 1024);
        }else {
            System.out.println("Не верный выбор. Повторите программу");
            return 0;
        }
    }

}




