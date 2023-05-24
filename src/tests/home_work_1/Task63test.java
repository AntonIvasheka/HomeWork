package tests.home_work_1;

import home_work_1.Task63;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task63test {
    @Test
    public void verification() {
        String name = "Вася";
        String expected = ("Привет! \n" + "Я тебя так долго ждал");
        Assertions.assertEquals(expected, Task63.answer(name));
    }
    @Test
    public void verification2() {
        String name = "Анастасия";
        String expected = ("Я тебя так долго ждал");
        Assertions.assertEquals(expected, Task63.answer(name));
    }
    @Test
    public void verification3() {
        String name = "Петя";
        String expected = ("Добрый день, а кто вы?");
        Assertions.assertEquals(expected, Task63.answer(name));
    }
}
