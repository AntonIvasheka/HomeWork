package home_work_1;

import java.util.Scanner;

public class Task45 {
    public static void main(String[] args) {
        char ch;
        System.out.println("Введите символ (определим англ. буква ли это) : ");
        Scanner in = new Scanner(System.in);
        String inStr = in.nextLine();
        ch = inStr.charAt(0);
        int check = inStr.length();
        if (check > 1) {
            System.out.print("Вы ввели более одного символа, проверен только первый и это - ");
        }
        letter(ch);
    }
    public static String letter(char ch ) {
        char bigA = 'A';
        char bigZ = 'Z';
        char smallA = 'a';
        char smallZ = 'z';
        if (((ch >= bigA) & (ch <= bigZ)) || ((ch >= smallA) & (ch <= smallZ))) {
            System.out.println("Буква");
            return "Буква";
        }
        else {
            System.out.println("Символ");
            return "Символ";
        }
    }

}
