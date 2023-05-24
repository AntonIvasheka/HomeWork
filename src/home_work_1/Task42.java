package home_work_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task42 {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        Scanner in;
        while (true) {
            in = new Scanner(System.in);
            try {
                System.out.println("Ввод числа a: ");
                a = in.nextDouble();
                System.out.println("Ввод числа b: ");
                b = in.nextDouble();
                System.out.println("Ввод числа c: ");
                c = in.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Wrong value, repeat!");
            }
        }
        comp(a,b,c);
    }


        public static double comp(double a, double b, double c) {
            // Проверка на равенство a!=b!=c
            //if (((a != b) & (a != c)) & (b != c)) {
                if ((a > b) & (a < c) | (a > c) & (a < b)) {
                    System.out.println("Среднее: " + a);
                    return a;
                }

                else if ((b > a) & (b < c) | (b < c) & (b > a)) {
                    System.out.println("Среднее: " + b);
                    return b;
                }

                else {
                    System.out.println("Среднее: " + c);
                    return c;
                }
           // } //else {
             // System.out.println("Средние число отсутствует. Одинаковые числа");
             //}


        }


}
