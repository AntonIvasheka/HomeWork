package home_work_2.loops;

import java.util.Random;
import java.util.Scanner;

public class Loops15 {
    public static void main(String[] args) {
        loops151();
        loops152();
        loops153();
        loops154();
        natNumber();
        flip();
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
    public static void loops153() {
        System.out.println("Подсччёт четных и неччётных цифр ччисла: ");
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
    public static void loops154() {
        System.out.println("Ряд Фибоначчи :");
        Scanner in = new Scanner(System.in);
        String inNut = String.valueOf(in.next());
        Long fab = Long.valueOf(inNut);
        int prev =0;
        int next =1;
        int i = 0;
        while ( i < fab) {
            next =  prev + next;
            prev = next - prev;
            i++;
            System.out.print(next + " ");
            System.out.println();
        }
    }
    public static void natNumber() {
        System.out.println("Ряд чисел в диапазоне с шагом ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int step = in.nextInt();
        if (b < a) {
            System.out.println("Не верные входные данные: " + a + " < " + b);
        } else {
            int cash = a;
            while ((cash) <= b) {
                System.out.print(cash + " ");
                cash = cash + step;
            }
        }
        System.out.println();
    }
    public static void flip() {
        System.out.println("Переворот числа");
        Scanner in = new Scanner(System.in);
        long num = in.nextLong();
        long outNum = 0;
        while (num>0) {
            outNum = (num % 10) + outNum*10;
            num = num / 10;
        }
        System.out.println(outNum);
    }
}

