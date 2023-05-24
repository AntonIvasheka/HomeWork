package home_work_2.loops;

import org.junit.platform.commons.util.StringUtils;

import java.util.Scanner;

public class Loops12 {
    public static String loop12(String str) {
        String resStr = "";
        long resault = 1;
        if ((new Scanner(str).hasNextLong())) {
            int strL = str.length();
            int y;
            for (int i = 0; i != strL; i++) {
                y = Integer.parseInt(String.valueOf(str.charAt(i)));
                resault = resault * y;
                System.out.print(y);
                resStr = resStr + Long.toString(y);
                if (i + 1 < strL) {
                    System.out.print(" * ");
                    resStr = resStr + " * ";
                }
            }
            System.out.println(" = " + resault);
            resStr = resStr + " = " + Long.toString(resault);
            return resStr;
        } else if (new Scanner(str).hasNextDouble()) {
            System.out.println("Введено не целое число");
            return "Введено не целое число";
        } else {
            System.out.println("Введено не число");
            return "Введено не число";
        }
    }
}