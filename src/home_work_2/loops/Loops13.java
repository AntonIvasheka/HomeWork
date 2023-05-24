package home_work_2.loops;

import java.util.Scanner;

public class Loops13 {
    public static double loop13(double a, int b) {
        int i =0;
        double res = 1;
        while (i != b) {
            i++;
            res = res * a;
        }
        System.out.println(res);
        return res;
    }
}
