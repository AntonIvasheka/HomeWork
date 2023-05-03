package home_work_2.loops;

import java.util.Scanner;

public class Loops13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a;
        int b;
        a = in.nextDouble();
        b = in.nextInt();
        int i =0;
        double res = 1;
        while (i != b) {
            i++;
            res = res * a;
        }
        System.out.println(res);
    }
}
