package tests.home_work_1;

import home_work_1.Task44;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task44test {
    @Test
    public void verification() {
        int  choice = 2;
        double num = 1;
        double expected = 1024;
        Assertions.assertEquals(expected, Task44.calc(choice,num));
    }
    @Test
    public void verification2() {
        int  choice = 1;
        double num = 2048;
        double expected = 2;
        Assertions.assertEquals(expected, Task44.calc(choice,num));
    }
    @Test
    public void verification3() {
        int  choice = 2;
        double num = 2;
        double expected = 2048;
        Assertions.assertEquals(expected, Task44.calc(choice,num));
    }
}
