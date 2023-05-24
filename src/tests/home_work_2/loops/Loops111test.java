package tests.home_work_2.loops;

import home_work_2.loops.Loops111;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Loops111test {
    @Test
    public void printFact() {
        long number = 5;
        String expected = "1 * 2 * 3 * 4 * 5 = 120";
        Assertions.assertEquals(expected, Loops111.factorial(number));
    }
    @Test
    public void printFact2() {
        long number = 3;
        String expected = "1 * 2 * 3 = 6";
        Assertions.assertEquals(expected, Loops111.factorial(number));
    }
    @Test
    public void printFact3() {
        long number = 7;
        String expected = "1 * 2 * 3 * 4 * 5 * 6 * 7 = 5040";
        Assertions.assertEquals(expected, Loops111.factorial(number));
    }
}
