package tests.home_work_2.arrays;

import home_work_2.arrays.Arrays24;
import home_work_2.loops.Loops15;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Arrays24test {
    @Test
    public void aray241(){
        int [] inArray= {1, 2, 3, 4, 5};
        int expected = 6;
        Assertions.assertEquals(expected, Arrays24.array241(inArray));
    }
    @Test
    public void aray2411(){
        int [] inArray= {1, -2, 3, 4, 5};
        int expected = 4;
        Assertions.assertEquals(expected, Arrays24.array241(inArray));
    }
    @Test
    public void aray242(){
        int [] inArray= {1, 2, 3, 4, 5};
        int expected = 5;
        Assertions.assertEquals(expected, Arrays24.array242(inArray));
    }
    @Test
    public void aray2421(){
        int [] inArray= {1, 2, 9, 4, 5};
        int expected = 9;
        Assertions.assertEquals(expected, Arrays24.array242(inArray));
    }
    @Test
    public void aray243(){
        int [] inArray= {1, 2, 9, 4, 5};
        String expected = "1 2 4 ";
        Assertions.assertEquals(expected, Arrays24.array243(inArray));
    }
    @Test
    public void aray2431(){
        int [] inArray= {1, 2, 9, 4, 32};
        String expected = "1 2 9 4 ";
        Assertions.assertEquals(expected, Arrays24.array243(inArray));
    }
    @Test
    public void aray244(){
        int [] inArray= {1, 2, -9, 4, 0};
        String expected = "0 -9";
        Assertions.assertEquals(expected, Arrays24.array244(inArray));
    }
    @Test
    public void aray2441(){
        int [] inArray= {1, 2, 9, 4, 32};
        String expected = "1 2";
        Assertions.assertEquals(expected, Arrays24.array244(inArray));
    }
    @Test
    public void aray245(){
        int [] inArray= {1, 2, 9, 4, 32};
        int [] expected = {1, 32, 0, 0, 0};
        Assertions.assertArrayEquals(expected, Arrays24.array245(inArray, 2, 9));
    }
    @Test
    public void aray2451(){
        int [] inArray= {1, 2, 9, 4, 32};
        int [] expected = {9, 4, 32, 0, 0};
        Assertions.assertArrayEquals(expected, Arrays24.array245(inArray, 1, 3));
    }
    @Test
    public void aray246(){
        int [] inArray= {17, 245};
        int expected = 19;
        Assertions.assertEquals(expected, Arrays24.array246(inArray));
    }
    @Test
    public void aray2461(){
        int [] inArray= {1, 2, 9, 4, 32};
        int expected = 21;
        Assertions.assertEquals(expected, Arrays24.array246(inArray));
    }
}

