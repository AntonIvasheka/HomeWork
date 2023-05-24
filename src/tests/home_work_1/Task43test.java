package tests.home_work_1;


import home_work_1.Task43;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Task43test {
    @Test
    public void verification() {
    double num1 = 15;
    double num2 = 3;
    Assertions.assertTrue(Task43.result(num1, num2));
    }
    @Test
    public void verification2() {
        double num1 = 3;
        double num2 = 6;
        Assertions.assertTrue(Task43.result(num1, num2));
    }
    @Test
    public void verification3() {
        double num1 = 6;
        double num2 = 6;
        Assertions.assertTrue(Task43.result(num1, num2));
    }
}
