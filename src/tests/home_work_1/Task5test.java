package tests.home_work_1;


import home_work_1.Task5;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

/**
 * Продолжаем ли спать?
 */
public class Task5test {
    @Test
    public void verification() {
        boolean weekday = true;
        boolean vacation = true;
        Assertions.assertTrue(Task5.sleepIn(weekday, vacation));
    }
    @Test
    public void verification2() {
        boolean weekday = false;
        boolean vacation = true;
        Assertions.assertTrue(Task5.sleepIn(weekday, vacation));
    }
    @Test
    public void verification3() {
        boolean weekday = false;
        boolean vacation = false;
        Assertions.assertTrue(Task5.sleepIn(weekday, vacation));
    }
}
