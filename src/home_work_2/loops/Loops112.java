package home_work_2.loops;

public class Loops112 {
    public static void main(String[] args) {
        long n = 10;
        long k = n+1;
        System.out.println(factorial(n, k));
    }
    public static long factorial(long n, long k) {
        if (n == 0) {
            return 1;
        }else {
                System.out.print(k - n);
                if (n != 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print(" = ");
                }
                return n * factorial(n - 1, k);
            }
    }
}


