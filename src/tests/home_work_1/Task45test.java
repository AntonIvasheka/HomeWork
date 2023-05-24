package tests.home_work_1;

import home_work_1.Task45;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task45test {
    @Test
    public void verification() {
        char ch = 'f';
        String expected = "Буква";
        Assertions.assertEquals(expected, Task45.letter(ch));
    }
    @Test
    public void verification2() {
        char ch = 'v';
        String expected = "Буква";
        Assertions.assertEquals(expected, Task45.letter(ch));
    }
    @Test
    public void verification3() {
        char  ch = ',';
        String expected = "Символ";
        Assertions.assertEquals(expected, Task45.letter(ch));
    }
}
