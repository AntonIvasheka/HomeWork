package home_work_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner in;
        byte num;
        while (true) {
            System.out.println("Ведите число в диапозоне [-128;127] : ");
            in = new Scanner(System.in);
            try {
                num = in.nextByte();
                System.out.println(toBinaryString(num));
                break;
            } catch (InputMismatchException e) {
                System.out.println("Wrong value, repeat!");
            }
        }
    }
    public static String toBinaryString(byte number) {
        int i;
        int chek=0;
        boolean minus = false;
        if (number<0) {
            minus = true;
            number *= -1;
        }
        String endOfString = "";
        while (number!=0) {
            i = number%2;
            endOfString = i + endOfString;
            chek++;
            number /= 2;
        }
        chek = 7 - chek;
        while (chek>=0) {
            endOfString = "0" + endOfString;
            chek--;
        }
        if (minus) {
            char[] chars = endOfString.toCharArray();
            int j = 7;
            while (j>=0) {
                if (chars[j] == '0') {
                    chars[j] = '1';
                } else chars[j] = '0';
                j--;
            }
            j = 7;
            do {
                if (chars[j] == '0') {
                chars[j] = '1';
                 } else {
                    chars[j] = '0';
                    j--;
                    }
            }
            while (chars[j] != '1');
            endOfString = String.valueOf(chars);
        }
        return endOfString;
    }
}
