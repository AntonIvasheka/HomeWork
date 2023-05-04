package home_work_2.arrays;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.random;

public class ArraysUtils {
    public static int[] arrayFromConsole() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int arrayVal = in.nextInt();
        int[] arrayFromConsole = new int[arrayVal];
        System.out.println("Введите элементы массива:");
            for (int i = 0; i < arrayVal; i++) {
                arrayFromConsole[i] = in.nextInt();
                }
        return arrayFromConsole;
    }
    public static int[] arrayRandom(int size, int maxValueExclusion) {
        int[] arrayRandom = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arrayRandom[i] = random.nextInt(maxValueExclusion);
        }
        return arrayRandom;
    }
}
