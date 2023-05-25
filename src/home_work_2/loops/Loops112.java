package home_work_2.loops;

public class Loops112 {
    public static String textFact(long n) {
        String resStr="";
        if (n != 0) {
            for (int i = 1; i <= n; i++) {
                if (i < n) {
                    System.out.print(i + " * ");
                    resStr = resStr + i + " * ";
                } else {
                    System.out.print(i + " = " + factorial(n));
                    resStr = resStr + i + " = " + factorial(n);
                }
            }
        } else if (n == 0) {
            System.out.println("0! = " + factorial(n));
            resStr = resStr + "0! = " + factorial(n);
        } else {
            System.out.println("Введено не верное число");
        }
        System.out.println();
        return resStr;
    }
    public static long factorial(long n) {
        if (n == 0) {
            return 1;
        }else {
            return n * factorial(n - 1);
        }
    }
}


