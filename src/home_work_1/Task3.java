package home_work_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        double data;
        while (true){
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Введите число: ");
            data = input.nextDouble();
            break;
        }
        catch (InputMismatchException e) {
            System.out.println("Wrong value, repeat!");
        }
        }
        data = Math.abs(data);
        System.out.println("Возвращаем числу абсолютное значение: " + data);
        data = Math.ceil(data);
        System.out.println("Округляем до целого в большую сторону: " + data);
        data = Math.cbrt(data);
        System.out.println("Извлекаем кубический корень: " + data);
        double area = Math.PI * Math.pow(data, 2);
        System.out.println("Площадь окружности: " + area);
        double length = 2*Math.PI*data;
        System.out.println("Длина окружности: " + length);
    }
}
