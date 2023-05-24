package tests.home_work_1;

import home_work_1.Task7;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static home_work_1.Task7.createPhoneNumber;

public class Task7test {
    @Test
    public void chekWrite() {
        int[] numbers = new int[] {2, 1, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println(createPhoneNumber(numbers));
        String expected = "(213) 456-7890";
        Assertions.assertEquals(expected, Task7.createPhoneNumber(numbers));
    }
    @Test
    public void chekWrite2() {
        int[] numbers = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println(createPhoneNumber(numbers));
        String expected = "(123) 456-7890";
        Assertions.assertEquals(expected, Task7.createPhoneNumber(numbers));
    }
    @Test
    public void chekWrite3() {
        int[] numbers = new int[] {0, 0, 0, 0, 0, 0, 7, 8, 9, 0};
        System.out.println(createPhoneNumber(numbers));
        String expected = "(000) 000-7890";
        Assertions.assertEquals(expected, Task7.createPhoneNumber(numbers));
    }
}
