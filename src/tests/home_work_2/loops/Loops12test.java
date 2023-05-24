package tests.home_work_2.loops;

import home_work_2.loops.Loops12;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Loops12test {
    @Test
    public void test1() {
        String str = "181232375";
        String expected = "1 * 8 * 1 * 2 * 3 * 2 * 3 * 7 * 5 = 10080";
        Assertions.assertEquals(expected, Loops12.loop12(str));
    }
    @Test
    public void test2() {
        String str = "99,2";
        String expected = "Введено не целое число";
        Assertions.assertEquals(expected, Loops12.loop12(str));
    }
    @Test
    public void test3() {
        String str = "Привет";
        String expected = "Введено не число";
        Assertions.assertEquals(expected, Loops12.loop12(str));
    }
    @Test
    public void test4() {
        String str = "99,22,1";
        String expected = "Введено не число";
        Assertions.assertEquals(expected, Loops12.loop12(str));
    }
    @Test
    public void test5() {
        String str = "13557436";
        String expected = "1 * 3 * 5 * 5 * 7 * 4 * 3 * 6 = 37800";
        Assertions.assertEquals(expected, Loops12.loop12(str));
    }
}
