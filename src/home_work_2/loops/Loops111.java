package home_work_2.loops;

public class Loops111 {
    public static void main(String[] args) {
        long fact = 5;
        long resault = 1;
        long privRes;
        for (int i=1 ; (fact>0) && (i<=fact); i++) {
            privRes = resault;
            resault = resault*i;
            if (resault < 0) {
            System.out.println("Переполнение(long), значение до переполнения: " + privRes);
            break;
            }
            System.out.print( i );
            if (i+1<=fact) {
                System.out.print(" * ");
            }
        }
        if (fact <= 0) {
            System.out.println("нечего вычислять");
        } else {
            System.out.println(" = " + resault);
        }
    }
}
