package home_work_1;

import java.util.Objects;
import java.util.Scanner;

public class Task61 {
    public static void main(String[] args) {
        System.out.println("Введите ваше имя : ");
        Scanner in = new Scanner(System.in);
        String name = in.next();
        if (Objects.equals(name,"Вася"))  System.out.println("Привет! \n" + "Я тебя так долго ждал");
        if (Objects.equals(name, "Анастасия"))  System.out.println("Я тебя так долго ждал");
         else System.out.println("Добрый день, а кто вы?");
    }
}
