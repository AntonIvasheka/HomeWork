package home_work_2.utils;

import java.util.Random;
import java.util.Scanner;

public class ArraysUtils {
    /**
     * Запрашиивает размер и целочисленные элементы массива через консоль,
     * создаёт массив согласно введенным данным
     * @return Введенный через консоль массив
     */
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
    /**
     * Создаёт массив ограниченный по размеру и заполненный рандомными элементами
     * @param size указывает размер массива.
     * @param maxValueExclusion до какого числа генерируются рандомные числа [0, maxValueExclusion].
     * @return Созданный массив, учитывающий введённые данные
     */
    public static int[] arrayRandom(int size, int maxValueExclusion) {
        int[] arrayRandom = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arrayRandom[i] = random.nextInt(maxValueExclusion);
        }
        return arrayRandom;
    }
}
