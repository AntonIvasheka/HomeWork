package home_work_2.loops;

import java.util.Scanner;

public class Loops155 {
    public static void main(String[] args) {
        int a;
        int b;
        int step;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        step = in.nextInt();
        natNumber(a, b, step);
    }
    public static void natNumber(int x, int y, int z) {
        if (y < x) {
            System.out.println("Не верные входные данные: " + x + " < " + y);
        } else {
            int cash = x;
            while ((cash) <= y) {
            System.out.print(cash + " ");
            cash = cash + z;
            }
        }
    }

}
