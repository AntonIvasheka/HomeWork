package home_work_2.arrays;

import static home_work_2.utils.ArraysUtils.arrayFromConsole;

public class ArraysIteration {
    public static void main(String[] args) {
        int[] prArray = arrayFromConsole();
        array221(prArray);
        array222(prArray);
        array223(prArray);
    }
    public static void array221(int[] prArray) {
        for (int k : prArray) {
            System.out.print(k + " ");
        }
        System.out.println();
    }
    public static void array222(int[] prArray) {
        int arrayLength = prArray.length;
        int i = 0;
        while (i != arrayLength) {
            if (i%2 != 0) {
                System.out.print(prArray[i] + " ");
            }
            i++;
        }
        System.out.println();
    }
    public static void array223(int[] prArray) {
        int arrayLength = prArray.length;
        do {
            arrayLength = arrayLength -1;
            System.out.print(prArray[arrayLength] + " ");
        } while (arrayLength > 0);
        System.out.println();
    }
}
