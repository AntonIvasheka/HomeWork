package tests.home_work_2.loops;

import home_work_2.loops.Loops13;
import home_work_2.loops.Loops15;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Loops15test {
    @Test
    public void loop151() {
        String str = "23632";
        double expected = 6;
        Assertions.assertEquals(expected, Loops15.loops151(str));
    }
    @Test
    public void loop1511() {
        String str = "569223467";
        double expected = 9;
        Assertions.assertEquals(expected, Loops15.loops151(str));
    }
    // Тесты для Random не проводил т.к. результат не предсказуем
    @Test
    public void loop153() {
        String str = "5692";
        String expected = "2 2";
        Assertions.assertEquals(expected, Loops15.loops153(str));
    }
    @Test
    public void loop1531() {
        String str = "56924643";
        String expected = "5 3";
        Assertions.assertEquals(expected, Loops15.loops153(str));
    }
    @Test
    public void loop154() {
        String str = "10";
        String expected = "0 1 1 2 3 5 8 13 21 34 ";
        Assertions.assertEquals(expected, Loops15.loops154(str));
    }
    @Test
    public void loop1541() {
        String str = "5";
        String expected = "0 1 1 2 3 ";
        Assertions.assertEquals(expected, Loops15.loops154(str));
    }
    @Test
    public void loop155() {
        int a = 2;
        int b = 5;
        int step = 1;
        String expected = "2 3 4 5 ";
        Assertions.assertEquals(expected, Loops15.natNumber(a, b, step));
    }
    @Test
    public void loop1551() {
        int a = 7;
        int b = 12;
        int step = 3;
        String expected = "7 10 ";
        Assertions.assertEquals(expected, Loops15.natNumber(a, b, step));
    }
    @Test
    public void loop156() {
        Long a = 1234567L;
        Long expected = 7654321L;
        Assertions.assertEquals(expected, Loops15.flip(a));
    }
    @Test
    public void loop1561() {
        Long a = 987654321L;
        Long expected = 123456789L;
        Assertions.assertEquals(expected, Loops15.flip(a));
    }
}
