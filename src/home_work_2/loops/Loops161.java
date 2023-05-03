package home_work_2.loops;

public class Loops161 {
    public static void main(String[] args) {
        int countNum = 10;
        int countColums = 5;
        int tmp=0;
        int tmp1 =0;
        do {
            for (int i = 1; i <= 10; i++) {
                for (int j = 1; j <= countColums; j++) {
                    System.out.print(j + " * " + i + " = " + (i * j) + "\t");
                    if ((i*j) == countColums * 10) {
                        System.out.println();

                    }
                }
                tmp++;
                System.out.println(tmp);

            }

        } while (tmp == 5);

        /*System.out.println();
            for (int k = 1; k <= 10; k++) {
                for (int l = countColums + 1; l <= countNum; l++) {
                    System.out.print(l + " * " + k + " = " + (k * l) + "\t");
                }
            System.out.println();
            }
        */
    }
}
