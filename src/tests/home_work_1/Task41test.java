package tests.home_work_1;



import home_work_1.Task41;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Task41test {
    @Test
    public void verification() {
    double num = 5;
    Assertions.assertFalse(Task41.calc(num));
    }
    @Test
    public void verification2() {
        double num = 7;
        Assertions.assertFalse(Task41.calc(num));
    }
    @Test
    public void verification3() {
        double num = -3;
        Assertions.assertFalse(Task41.calc(num));
    }
}
