package home_work_2.loops;

import java.util.Scanner;

public class Loops15444 {
    public static void main(String[] args) {
        loops151();
    }
    public static void loops151() {
        System.out.println("Нахождение наибольшей цифры натурального числа:");
        Scanner in = new Scanner(System.in);
        String inNut = String.valueOf(in.next());
        int lengthA = inNut.length();
        Long numEl = Long.valueOf(inNut);
        int a = 0;
        int b = 0;
            for (int i=1; i<=lengthA; i++) {
                System.out.println();
                if (numEl % 10 == 0) {

                    a++;
                } else {
                    b++;
                }
            }
        System.out.println("кол-во чётных : " + a);
        System.out.println("кол-во нечётных : " + b);
    }

}

