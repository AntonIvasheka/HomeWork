package home_work_1;

public class Task2 {
    public static void main(String[] args) {
    int a = 5 + 2 / 8;
        System.out.println("2.1  5 + 2 / 8 = " + a);
    int b = (5 + 2) / 8;
        System.out.println("2.2  (5 + 2) / 8 = " + b);
    int x = 2;
    int c = (5 +x++) / 8;
        System.out.println("2.3  (5 + 2++) / 8 = " +c);
    x = 2;
    int y = 8;
    int d = (5 + x++) / --y;
        System.out.println("2.4  (5 + 2++) / --8 = " +d);
    x = 2;
    y = 8;
    int e = (5 * 2 >> x++) / --y;
        System.out.println("2.5  (5 * 2 >> 2++) / --8 = " +e);
    x = 2;
    y = 8;
    int f = (5 + 7 > 20 ? 68 : 22 * 2 >> x++) / --y;
        System.out.println("2.6  (5 + 7 > 20 ? 68 : 22 * 2 >> 2++) / --8 = " + f);
    x = 2;
    y = 8;
        /*int g = (5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> x++) / --y;
        Результатом данной операцииии будет тернальное выражениие вида g = (false ? true : 10 ) / 7,
        в котором 2-й и 3-й операнд возвращают значениия разного( не приводимого ) типа

        System.out.println("2.7  (5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> 2++) / --8 = " + g);
        */
    boolean h = 6 - 2 > 3 && 12 * 12 <= 119;
        System.out.println("2.8  6 - 2 > 3 && 12 * 12 <= 119 = " + h);
    boolean k = true && false;
        System.out.println("2.9  true && false = " + k);
    }

}
