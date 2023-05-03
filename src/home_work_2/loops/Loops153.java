package home_work_2.loops;

import java.util.Scanner;

public class Loops153 {
    public static void main(String[] args) {
    loops151();
    }
    public static void loops151() {
        System.out.println("Нахождение наибольшей цифры натурального числа:");
        Scanner in = new Scanner(System.in);
        String inNut = String.valueOf(in.next());
        int lengthA = inNut.length();
        Long numEl = Long.valueOf(inNut);
        int chet =0;
        int nechet =0;
            for (int i=1; i<=lengthA; i++) {
                if (((int) (numEl % 10) % 2) == 0) {
                    chet++;
                } else {
                    nechet++;
                }
            numEl = numEl / 10;
            }
        System.out.println("Чётных: " +chet);
        System.out.println("Нечётных: " +nechet);
    }

}

