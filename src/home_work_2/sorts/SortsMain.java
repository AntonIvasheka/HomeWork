package home_work_2.sorts;

import java.util.Arrays;

import static home_work_2.utils.ArraysUtils.arrayFromConsole;
import static home_work_2.utils.ArraysUtils.arrayRandom;
import static home_work_2.utils.SortsUtils.shake;
import static home_work_2.utils.SortsUtils.sort;

public class SortsMain {
    public static void main(String[] args) {
        int[] test = new int[]{1,2,3,4,5,6};
        String inArrayToString = Arrays.toString(test);
        System.out.print(inArrayToString + " -> ");
        String arrayToString = Arrays.toString(sort(test));
        System.out.println(arrayToString);
        System.out.print(inArrayToString + " -> ");
        arrayToString = Arrays.toString(shake(test));
        System.out.println(arrayToString);

        test = new int[]{1,1,1,1};
        inArrayToString = Arrays.toString(test);
        System.out.print(inArrayToString + " -> ");
        arrayToString = Arrays.toString(sort(test));
        System.out.println(arrayToString);
        System.out.print(inArrayToString + " -> ");
        arrayToString = Arrays.toString(shake(test));
        System.out.println(arrayToString);

        test = new int[]{9,1,5,99,9,9};
        inArrayToString = Arrays.toString(test);
        System.out.print(inArrayToString + " -> ");
        arrayToString = Arrays.toString(sort(test));
        System.out.println(arrayToString);
        System.out.print(inArrayToString + " -> ");
        arrayToString = Arrays.toString(shake(test));
        System.out.println(arrayToString);

        test = new int[]{};
        inArrayToString = Arrays.toString(test);
        System.out.print(inArrayToString + " -> ");
        arrayToString = Arrays.toString(sort(test));
        System.out.println(arrayToString);
        System.out.print(inArrayToString + " -> ");
        arrayToString = Arrays.toString(shake(test));
        System.out.println(arrayToString);

        test = new int[]{6,5,4,3,2,1};
        inArrayToString = Arrays.toString(test);
        System.out.print(inArrayToString + " -> ");
        arrayToString = Arrays.toString(sort(test));
        System.out.println(arrayToString);
        System.out.print(inArrayToString + " -> ");
        arrayToString = Arrays.toString(shake(test));
        System.out.println(arrayToString);

        test = arrayRandom(50, 100);
        inArrayToString = Arrays.toString(test);
        System.out.print(inArrayToString + " -> ");
        arrayToString = Arrays.toString(sort(test));
        System.out.println(arrayToString);
        System.out.print(inArrayToString + " -> ");
        arrayToString = Arrays.toString(shake(test));
        System.out.println(arrayToString);

        test = arrayFromConsole();
        inArrayToString = Arrays.toString(test);
        System.out.print(inArrayToString + " -> ");
        arrayToString = Arrays.toString(sort(test));
        System.out.println(arrayToString);
        System.out.print(inArrayToString + " -> ");
        arrayToString = Arrays.toString(shake(test));
        System.out.println(arrayToString);
    }
}
