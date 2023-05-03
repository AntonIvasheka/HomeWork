package home_work_2.loops;

import java.util.Scanner;

public class Loops151 {
    public static void main(String[] args) {
        loops151();
    }
    public static void loops151() {
        System.out.println("Нахождение наибольшей цифры натурального числа:");
        Scanner in = new Scanner(System.in);
        String inNut = String.valueOf(in.next());
        int lengthA = inNut.length();
        Long numEl = Long.valueOf(inNut);
        int maxNum = (int) (numEl % 10);
            for (int i=1; i<=lengthA; i++) {
                if (maxNum < (int) (numEl%10)) {
                    maxNum = (int) (numEl % 10);
                }
                numEl = numEl/10;
                }
        System.out.println("наибольшая цифра: " +maxNum);
    }

}

