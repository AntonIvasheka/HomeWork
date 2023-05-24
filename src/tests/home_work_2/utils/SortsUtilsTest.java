package tests.home_work_2.utils;

import home_work_2.arrays.Arrays24;
import home_work_2.utils.SortsUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortsUtilsTest {
    @Test
    public void sortUtil() {
        int [] inArray= {1, 2, 9, 4, 32};
        int [] expected = {1, 2, 4, 9, 32};
        Assertions.assertArrayEquals(expected, SortsUtils.sort(inArray));
    }
    @Test
    public void sortUtil2() {
        int [] inArray= {9, 8, 7, 6, 5};
        int [] expected = {5, 6, 7, 8, 9};
        Assertions.assertArrayEquals(expected, SortsUtils.sort(inArray));
    }
    @Test
    public void sortUtil3shake() {
        int [] inArray= {1, 2, 9, 4, 32};
        int [] expected = {1, 2, 4, 9, 32};
        Assertions.assertArrayEquals(expected, SortsUtils.shake(inArray));
    }
    @Test
    public void sortUtil4shake() {
        int [] inArray= {9, 8, 7, 6, 5};
        int [] expected = {5, 6, 7, 8, 9};
        Assertions.assertArrayEquals(expected, SortsUtils.shake(inArray));
    }
}
