package tests.home_work_1;

import home_work_1.Task42;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task42test {
    @Test
    public void verification() {
        double a = 2;
        double b = 4;
        double c = 3;
        double expected = 3;
        Assertions.assertEquals(expected, Task42.comp(a,b,c));
    }
    @Test
    public void verification2() {
        double a = 2;
        double b = 7;
        double c = 14;
        double expected = 7;
        Assertions.assertEquals(expected, Task42.comp(a,b,c));
    }
    @Test
    public void verification3() {
        double a = -5;
        double b = -2;
        double c = 0;
        double expected = -2;
        Assertions.assertEquals(expected, Task42.comp(a,b,c));
    }
}
