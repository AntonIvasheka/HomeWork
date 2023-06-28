package tests.home_work_6;

import home_work_6.EasySearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HW6tests {
    /**
     * Тесты согласно аннотации
     */
    @Test
    public void test1() {
        EasySearch test1 = new EasySearch();
        String text = "привет, как дела!";
        String word = "дела";
        Assertions.assertEquals(1,test1.search(text, word));
    }
    @Test
    public void test2() {
        EasySearch test1 = new EasySearch();
        String text = "привет,какдела!";
        String word = "дела";
        Assertions.assertEquals(0,test1.search(text, word));
    }
    @Test
    public void test3() {
        EasySearch test1 = new EasySearch();
        String text = "привет;какдела!";
        String word = "какдела";
        Assertions.assertEquals(1,test1.search(text, word));
    }
    @Test
    public void test4() {
        EasySearch test1 = new EasySearch();
        String text = "как дела!.Что делаешь?";
        String word = "делаешь";
        Assertions.assertEquals(1,test1.search(text, word));
    }
    @Test
    public void test5() {
        EasySearch test1 = new EasySearch();
        String text = "привет-привет";
        String word = "привет";
        Assertions.assertEquals(2,test1.search(text, word));
    }
    @Test
    public void test6() {
        EasySearch test1 = new EasySearch();
        String text = "привет -привет";
        String word = "привет";
        Assertions.assertEquals(2,test1.search(text, word));
    }
    @Test
    public void test7() {
        EasySearch test1 = new EasySearch();
        String text = "4-х";
        String word = "4";
        Assertions.assertEquals(1,test1.search(text, word));
    }
    @Test
    public void test8() {
        EasySearch test1 = new EasySearch();
        String text = "один и 1";
        String word = "1";
        Assertions.assertEquals(1,test1.search(text, word));
    }
    @Test
    public void test9() {
        EasySearch test1 = new EasySearch();
        String text = "бабушка бабушке бабушку";
        String word = "баб";
        Assertions.assertEquals(0,test1.search(text, word));
    }
    @Test
    /**
     * В данном тесте испольуется проверка на наличие разделительного знака, после подстроки "один" в первом
     * случае, и перед во втором
     */
    public void test10() {
        EasySearch test1 = new EasySearch();
        String text = "одиндваодин";
        String word = "один";
        Assertions.assertEquals(0,test1.search(text, word));
    }
    @Test
    public void test11() {
        EasySearch test1 = new EasySearch();
        String text = "один два,один";
        String word = "один";
        Assertions.assertEquals(2,test1.search(text, word));
    }
    @Test
    /**
     * В данном тесте испольуется проверка на наличие разделительного знака до и после подстроки "два"
     */
    public void test12() {
        EasySearch test1 = new EasySearch();
        String text = "один два,один";
        String word = "два";
        Assertions.assertEquals(1,test1.search(text, word));
    }
}
