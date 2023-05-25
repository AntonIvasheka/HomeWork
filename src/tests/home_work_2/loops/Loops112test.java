package tests.home_work_2.loops;

import home_work_2.loops.Loops112;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Loops112test {
        @Test
        public void factorial() {
            long number = 5;
            String expected = "1 * 2 * 3 * 4 * 5 = 120";
            Assertions.assertEquals(expected, Loops112.textFact(number));
        }
        @Test
        public void printFact2() {
            long number = 3;
            String expected = "1 * 2 * 3 = 6";
            Assertions.assertEquals(expected, Loops112.textFact(number));
        }
        @Test
        public void printFact3() {
            long number = 7;
            String expected = "1 * 2 * 3 * 4 * 5 * 6 * 7 = 5040";
            Assertions.assertEquals(expected, Loops112.textFact(number));
        }
        @Test
        public void printFact4() {
                long number = 0;
                String expected = "0! = 1";
                Assertions.assertEquals(expected, Loops112.textFact(number));
        }
}