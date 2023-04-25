package home_work_1;

import java.util.Scanner;

public class Task45 {
    public static void main(String[] args) {
        char ch;
        System.out.println("Введите символ (определим англ. буква ли это) : ");
        Scanner in = new Scanner(System.in);
        ch = in.next().charAt(0);
        char bigA = 'A';
        char bigZ = 'Z';
        char smallA = 'a';
        char smallZ = 'z';
        if (((ch>=bigA)&(ch<=bigZ))||((ch>=smallA)&(ch<=smallZ))) System.out.println("Буква");
            else System.out.println("Символ");

    }
}
