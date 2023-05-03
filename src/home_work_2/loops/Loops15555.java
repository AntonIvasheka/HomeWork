package home_work_2.loops;

import java.util.Random;

public class Loops15555 {
    public static void main(String[] args) {
    long numOp;
    numOp = 1333;
    loops152(numOp);
    }
    public static void loops152(long numOperation) {
        Random rand = new Random();
        int a = 0;
        int c = 0;
        double verr = numOperation;
        do {
            int b = rand.nextInt();
            if (b % 2 == 0) {
                a++;
            } else {
                c++;
            }
            verr--;
        }
        while (verr > 0);
        System.out.println("чётных чисел : " + a);
        System.out.println("нечётных чисел : " + c);
    }
}
