package home_work_2.loops;

import java.util.Scanner;

public class Loops12 {
    public static void main(String[] args) {
        String str;
        Scanner in = new Scanner(System.in);
        long resault = 1;
        if (in.hasNextLong()) {
            str = in.nextLine();
            int strL = str.length();
            int y;
            for (int i = 0; i != strL; i++) {
                y = Integer.parseInt(String.valueOf(str.charAt(i)));
                resault = resault * y;
                System.out.print(y);
                if (i + 1 < strL) {
                    System.out.print(" * ");
                }
            }
            System.out.println(" = " + resault);
        } else if (in.hasNextDouble()) {
            System.out.println("Введено не целое число");
        } else {
            System.out.println("Введено не число");
        }

    }
}
