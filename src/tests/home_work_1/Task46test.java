package tests.home_work_1;

import home_work_1.Task46;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task46test {
    @Test
    public void verification() {
        int year = 1983;
        String expected = "Обычный год";
        Assertions.assertEquals(expected, Task46.whatYear(year));
    }
    @Test
    public void verification2() {
        int year = 2000;
        String expected = "Обычный год";
        Assertions.assertEquals(expected, Task46.whatYear(year));
    }
    @Test
    public void verification3() {
        int year = 1980;
        String expected = "Високосный год";
        Assertions.assertEquals(expected, Task46.whatYear(year));
    }
}
