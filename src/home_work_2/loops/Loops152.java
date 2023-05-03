package home_work_2.loops;

import java.util.Random;

public class Loops152 {
    public static void main(String[] args) {
    long numOp;
    numOp = 1333;
    loops152(numOp);
    }
    public static void loops152(long numOperation) {
        Random rand = new Random();
        double a = 0;
        double verr = numOperation;
        do {
            int b = rand.nextInt();
            if (b % 2 == 0) {
                a++;
            }
            verr--;
        }
        while (verr > 0);
        System.out.println("Вероятность чётных чисел : " +(a/numOperation * 100) + "%");
    }
}
