package home_work_1;

import java.util.Objects;
import java.util.Scanner;

public class Task63 {
    public static void main(String[] args) {
        System.out.println("Введите ваше имя : ");
        Scanner in = new Scanner(System.in);
        String name = in.next();
        answer(name);
    }
    public static String answer(String name) {

        switch (name){
            case "Вася":
                System.out.println("Привет! \n" + "Я тебя так долго ждал");
                return ("Привет! \n" + "Я тебя так долго ждал");
                //break;
            case "Анастасия":
                System.out.println("Я тебя так долго ждал");
                return ("Я тебя так долго ждал");
                //break;
            default:
                System.out.println("Добрый день, а кто вы?");
                return ("Добрый день, а кто вы?");
                //break;
        }
    }
}
