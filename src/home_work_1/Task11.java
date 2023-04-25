package home_work_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner sc;
        int firstNumber;
        int secondNumber;
        while (true) {
            sc = new Scanner(System.in);
            try {
                 System.out.println("Введите первое число: ");
                 firstNumber = sc.nextInt(); // Примем за первое число за 1 - 0000 0001
                 System.out.println("Введите второе число: ");
                 secondNumber = sc.nextInt(); // За второе чило берём 2 - 0000 0010
                 break;
            }
            catch (InputMismatchException e) {
            System.out.println("Wrong value, repeat!");
            }
        }
        int a = firstNumber & secondNumber; // Операция И имеет результат 0000 0000
        int b = firstNumber | secondNumber; // Операция ИЛИ имеет результат 0000 0011
        System.out.println("Результат побитовой операции И: " + a); // Вывод результата в десятичном виде: 0
        System.out.println("Результат побитовой операции ИЛИ: " + b); // Вывод результата в десятичном виде: 3

    }
}
