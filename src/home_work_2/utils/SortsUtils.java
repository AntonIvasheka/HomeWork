package home_work_2.utils;

public class SortsUtils {
    public static int[] sort(int[] arr) {
        int arrayLength = arr.length;
        int tmp = 0;
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
    public static int[] shake(int[] arr) {
        int arrayLength = arr.length;
        int left = 0;
        int right = arrayLength - 1;
        int chek = 1;
        int tmp = 0;
        while ((left < right) && chek > 0) {
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

