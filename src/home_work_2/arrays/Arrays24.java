package home_work_2.arrays;

import static home_work_2.arrays.ArraysUtils.arrayRandom;

public class Arrays24 {
    public static void main(String[] args) {
        int[] inArray = arrayRandom(50, 100);
        array241(inArray);
        array242(inArray);
        array243(inArray);
        array244(inArray);
        int a = 1;
        int b = 10;
        array245(inArray,a,b);
        array246(inArray);
    }
    public static void array241(int[] inArray) {
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
    }
    public static void array242(int[] inArray) {
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
    }
    public static void array243(int[] inArray) {
        int arrayLength = inArray.length;
        double middle = 0;
        for (int j : inArray) {
            middle = middle + j;
        }
        middle = middle / arrayLength;
        System.out.print("Элементы меньше среднего арифметического : ");
        for (int k : inArray) {
            if ( k < middle) {
                System.out.print(k +" ");
            }
        }
        System.out.println();
    }
    public static void array244 (int[] inArray) {
        int arrayLength = inArray.length;
        int minA = inArray[0];
        int minB = inArray[1];
        for (int  i = 3; i < arrayLength; i++) {
            if ( inArray[i] < minB) {
                minB = inArray[i];
            } else if ( inArray[i] < minA) {
                minA = inArray[i];
            }
        }
        System.out.println("Два наименьших элемента массива: " + minA + "   " + minB);
    }
    public static void array245 (int[] inArray , int a, int b) {
        int arrayLength = inArray.length;
        int[] outArray = new int[arrayLength];
        int delEl = 0;
        for (int i = 0; i < arrayLength; i++) {
            if (!((a <= inArray[i]) & (inArray[i] <= b))) { // a, b Считал, что введены корректно : a<=b
                outArray[delEl] = inArray[i];
                delEl = delEl + 1;
            }
        }
        for (int x: outArray) {
                  System.out.print(x + " ");
            }
        System.out.println("Удалены элементы в интервале " + "[" + a + ", " + b + "]");
    }
    public static void array246 (int[] inArray) {
        int sum = 0;
        for (int x : inArray) {
            do {
                sum = (x % 10) + sum;
                x = x / 10;
            } while (x != 0);
        }
        System.out.println("Сумма цифр массива : " + sum);
    }

}
