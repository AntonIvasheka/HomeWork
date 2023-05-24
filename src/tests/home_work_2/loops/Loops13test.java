package tests.home_work_2.loops;

import home_work_2.loops.Loops13;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Loops13test {
    @Test
    public void degree() {
        double a = 2;
        int b = 3;
        double expected = 8;
        Assertions.assertEquals(expected, Loops13.loop13(a, b));
    }
    @Test
    public void degree2() {
        double a = 18;
        int b = 5;
        double expected = 1889568;
        Assertions.assertEquals(expected, Loops13.loop13(a, b));
    }
    @Test
    public void degree3() {
        double a = 7.5;
        int b = 2;
        double expected = 56.25;
        Assertions.assertEquals(expected, Loops13.loop13(a, b));
    }
    @Test
    public void degree4() {
        double a = 12;
        int b = 2;
        double expected = 144;
        Assertions.assertEquals(expected, Loops13.loop13(a, b));
    }
    @Test
    public void degree5() {
        double a = 17;
        int b = 0;
        double expected = 1;
        Assertions.assertEquals(expected, Loops13.loop13(a, b));
    }
}