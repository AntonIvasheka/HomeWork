package home_work_2.loops;

import java.util.Scanner;

public class Loops156 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long num = in.nextLong();
        flip(num);
    }
    public static void flip(long inNum) {
        long outNum = 0;
        while (inNum>0) {
            outNum = (inNum % 10) + outNum*10;
            inNum = inNum / 10;

        }
        System.out.println(outNum);
    }
}
