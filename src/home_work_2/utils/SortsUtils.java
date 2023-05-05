package home_work_2.utils;

public class SortsUtils {
    /**
     * Сортирует переданный массив при помощи алгоритма пузырьковой сортировки
     * @param arr Массив из целых чисел
     * @return Отсортированный массив по возрастанию
     */
    public static int[] sort(int[] arr) {
        int arrayLength = arr.length;
        int tmp;
        for (int j = 0; j < (arrayLength - 1); j++) {
            for (int i = (arrayLength - 1); i > j; i--) {
                if (arr[i] < arr[i - 1]) {
                    tmp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = tmp;
                }
            }
        }
        return (arr);
    }
    /**
     * Сортирует переданный массив при помощи алгоритма шейкерной сортировки
     * @param arr Массив из целых чисел
     * @return Отсортированный массив по возрастанию
     */
    public static int[] shake(int[] arr) {
        int arrayLength = arr.length;
        int left = 0;
        int right = arrayLength - 1;
        int chek = 1;
        int tmp;
        while (chek > 0 || (left < right)) {
            chek = 0;
            for (int i = left; i < right; i++) {
                if (arr[i] > arr[i + 1]) {
                    tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    chek = 1;
                }
            }
            right--;
            for (int i = right; i > left; i--) {
                if (arr[i - 1] > arr[i]) {
                    tmp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = tmp;
                    chek = 1;
                }
            }
            left++;
        }
        return (arr);
    }
}

