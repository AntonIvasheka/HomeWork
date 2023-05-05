package home_work_2.loops;

public class Loops14 {
    public static void main(String[] args) {
        long a = 1;
        long resault = a;
        long privRes;
        long inNum = 5;
        for (int i=1 ; i >0 ; i++) {
            privRes = resault;
            resault = resault*inNum;
            if (resault < 0) {
            System.out.println("Переполнение(long), значение до переполнения: " + privRes);
            System.out.println("Переполнение(long), значение после: " + resault);
            break;
            }
        }
    }
}
// что-то я запарился - не смог понять как...