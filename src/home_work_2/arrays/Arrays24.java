package home_work_2.arrays;

import java.sql.Array;

import static home_work_2.utils.ArraysUtils.arrayRandom;


public class Arrays24 {
    public static void main(String[] args) {
        int[] inArray = arrayRandom(50, 100);
        array241(inArray);
        array242(inArray);
        array243(inArray);
        array244(inArray);
        int a = 10;
        int b = 1;
        array245(inArray,a,b);
        array246(inArray);
    }

    /**
     * Подсчет суммыы чётных положительных элементов массива с выволом результата в консоль
     * @param inArray Целочисленный массив
     */
    public static long array241(int[] inArray) {
        for (int k : inArray) {
            System.out.print(k + " ");
        }
        System.out.println();
        int arrayLength = inArray.length;
        int i = 0;
        long sum = 0;

        while (i != arrayLength) {
            if ((inArray[i]%2 == 0) & (inArray[i] > 0)) {
                sum = sum + inArray[i];
            }
            i++;
        }
        System.out.println("Сумма четных положительных элементов : " + sum);
        return sum;
    }

    /**
     * Нахождение максимального элемента массива с чётным индексом и выводом реззультата в консоль
     * @param inArray Целочисленный массив
     */
    public static int array242(int[] inArray) {
        int arrayLength = inArray.length;
        int i = 0;
        int maxElement = inArray[0];
        while (i != arrayLength) {
            if ((i%2 == 0) & (maxElement < inArray[i])) {
                maxElement = inArray[i];
            }
            i++;
        }
        System.out.println("Максимальный элемент с чётным индексом : " + maxElement);
        return maxElement;
    }

    /**
     * Нахождение элементов массива меньших среднего арифметического и выводом результата в консоль
     * @param inArray Целочисленный массив
     */
    public static String array243(int[] inArray) {
        int arrayLength = inArray.length;
        double middle = 0;
        String resStr ="";
        for (int j : inArray) {
            middle = middle + j;
        }
        middle = middle / arrayLength;
        System.out.print("Элементы меньше среднего арифметического : ");
        for (int k : inArray) {
            if ( k < middle) {
                System.out.print(k +" ");
                resStr = resStr + k + " ";
            }
        }
        System.out.println();
        return resStr;
    }

    /**
     * Нахождение двух наименьших элементов массива и вывод результата в консоль
     * @param inArray Целочисленный массив
     */
    public static String array244 (int[] inArray) {
        int arrayLength = inArray.length;
        int minA = inArray[0];
        int minB = inArray[1];
        String resStr ="";
        for (int  i = 2; i < arrayLength; i++) {
            if ( inArray[i] < minB) {
                minB = inArray[i];
            } else if ( inArray[i] < minA) {
                minA = inArray[i];
            }
        }
        System.out.println("Два наименьших элемента массива: " + minA + "   " + minB);
        resStr = resStr + minA + " " + minB;
        return resStr;
    }

    /**
     * Удаляет из массива элементы, принадлежащие интервалу, и вывод результата в консоль
     * @param inArray Целочисленный массив
     * @param a Ограничение интервала
     * @param b Ограничение интервала
     */
    public static int[] array245 (int[] inArray , int a, int b) {
        int arrayLength = inArray.length;
        int[] outArray = new int[arrayLength];
        int delEl = 0;
        if (a>b) {       // Считаю, что интервалы a,b и b,a - одинаковые
            int tmp = a;
            a = b;
            b = tmp;
        }
        for (int i = 0; i < arrayLength; i++) {
            if (!((a <= inArray[i]) & (inArray[i] <= b))) {
                outArray[delEl] = inArray[i];
                delEl = delEl + 1;
            }
        }
        for (int x: outArray) {
                  System.out.print(x + " ");
            }
        System.out.println("Удалены элементы в интервале " + "[" + a + ", " + b + "]");
        return outArray;
    }

    /**
     * Подсчёт суммы циифр элементов массива и вывод результата в консоль
     * @param inArray Целочисленный массив
     */
    public static int array246 (int[] inArray) {
        int sum = 0;
        for (int x : inArray) {
            do {
                sum = (x % 10) + sum;
                x = x / 10;
            } while (x != 0);
        }
        System.out.println("Сумма цифр массива : " + sum);
        return sum;
    }

}
