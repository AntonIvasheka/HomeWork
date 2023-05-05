package home_work_2.arrays;

import static home_work_2.utils.ArraysUtils.arrayRandom;

public class Arrays2121 {
    public static void main(String[] args) {
        int[] conteiner = arrayRandom(5, 100);
        for (int i : conteiner) {
            System.out.print(i + " ");
        }
    }
}
