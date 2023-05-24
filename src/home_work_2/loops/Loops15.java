package home_work_2.loops;

import java.util.Random;
import java.util.Scanner;

public class Loops15 {
    public static int loops151(String str) {
        System.out.println("Нахождение наибольшей цифры натурального числа:");
        //Scanner in = new Scanner(System.in);
        String inNut = String.valueOf(str);
        int lengthA = str.length();
        Long numEl = Long.valueOf(inNut);
        int maxNum = (int) (numEl % 10);
            for (int i=1; i<=lengthA; i++) {
                if (maxNum < (int) (numEl%10)) {
                    maxNum = (int) (numEl % 10);
                }
                numEl = numEl/10;
                }
        System.out.println("наибольшая цифра: " +maxNum);
            return maxNum;
    }

    public static void loops152() {
        System.out.println("Вероятность чётных чисел из :");
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int a = 0;
        int numOperation = in.nextInt();
        double rez = numOperation;
        do {
            int b = rand.nextInt();
            if (b % 2 == 0) {
                a++;
            }
            numOperation--;
        } while (numOperation > 0);
        rez = a/rez;
        System.out.println("Вероятность чётных чисел : " + (rez * 100) + "%");
    }
    public static String loops153(String str) {
        System.out.println("Подсчёт четных и нечётных цифр ччисла: ");
        //Scanner in = new Scanner(System.in);
        String inNut = String.valueOf(str);
        int lengthA = inNut.length();
        Long numEl = Long.valueOf(inNut);
        int chet =0;
        int nechet =0;
        String resStr="";
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
        resStr = String.valueOf(chet) + " " + String.valueOf(nechet);
        return (resStr);
    }
    public static String loops154(String str) {
        System.out.println("Ряд Фибоначчи :");
        //Scanner in = new Scanner(System.in);
        String inNut = String.valueOf(str);
        Long fab = Long.valueOf(inNut);
        int prev =0;
        int next =1;
        int i = 0;
        String resStr="0 ";
        while ( i < fab-1) {
            resStr = resStr + String.valueOf(next) + " ";
            next =  prev + next;
            prev = next - prev;
            i++;

        }
        System.out.println(resStr);
        return resStr;
    }
    public static String natNumber(int a, int b, int step) {
        System.out.println("Ряд чисел в диапазоне с шагом ");
        //Scanner in = new Scanner(System.in);
        //int a = in.nextInt();
        //int b = in.nextInt();
        //int step = in.nextInt();
        String resStr="";
        if (b < a) {
            System.out.println("Не верные входные данные: " + a + " < " + b);
        } else {
            int cash = a;
            while ((cash) <= b) {
                System.out.print(cash + " ");
                resStr = resStr + String.valueOf(cash)  + " ";
                cash = cash + step;
            }
        }
        System.out.println();
        return resStr;
    }
    public static Long flip(Long num) {
        System.out.println("Переворот числа");
        Scanner in = new Scanner(System.in);
        //long num = in.nextLong();
        long outNum = 0;
        while (num>0) {
            outNum = (num % 10) + outNum*10;
            num = num / 10;
        }
        System.out.println(outNum);
        return outNum;
    }
}

