package home_work_1;

public class Task5 {
    public static void main(String[] args) {
        if (sleepIn(true, false)) System.out.println("Спим дальше");
        else System.out.println("Пора идти на работу");
    }
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation ) return true;
        else return false;
    }
}
