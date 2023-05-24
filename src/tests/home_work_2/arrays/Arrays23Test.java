package tests.home_work_2.arrays;

import home_work_2.arrays.*;
import home_work_2.utils.SortsUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Arrays23Test {
    @Test
    public void testInterface() {
        int [] inArray = {1, 2, 3, 4, 5};
        String expected = "1 2 3 4 5 ";
        IArraysOperation forPrint = new DoWhileOperation();
        Assertions.assertEquals(expected, forPrint.printArray(inArray));
    }
    @Test
    public void testInterface2() {
        int [] inArray = {1, 2, 3, 4, 5};
        String expected = "2 4 ";
        IArraysOperation forPrint = new DoWhileOperation();
        Assertions.assertEquals(expected, forPrint.viaEl(inArray));
    }
    @Test
    public void testInterface3() {
        int [] inArray = {1, 2, 3, 4, 5};
        String expected = "5 4 3 2 1 ";
        IArraysOperation forPrint = new DoWhileOperation();
        Assertions.assertEquals(expected, forPrint.reverseEl(inArray));
    }
    @Test
    public void testInterface21() {
        int [] inArray = {1, 2, 3, 4, 5};
        String expected = "1 2 3 4 5 ";
        IArraysOperation forPrint = new WhileOperation();
        Assertions.assertEquals(expected, forPrint.printArray(inArray));
    }
    @Test
    public void testInterface22() {
        int[] inArray = {1, 2, 3, 4, 5};
        String expected = "2 4 ";
        IArraysOperation forPrint = new WhileOperation();
        Assertions.assertEquals(expected, forPrint.viaEl(inArray));
    }
    @Test
    public void testInterface23() {
        int [] inArray = {1, 2, 3, 4, 5};
        String expected = "5 4 3 2 1 ";
        IArraysOperation forPrint = new WhileOperation();
        Assertions.assertEquals(expected, forPrint.reverseEl(inArray));
    }
    @Test
    public void testInterface31() {
        int [] inArray = {1, 2, 3, 4, 5};
        String expected = "1 2 3 4 5 ";
        IArraysOperation forPrint = new ForOperation();
        Assertions.assertEquals(expected, forPrint.printArray(inArray));
    }
    @Test
    public void testInterface32() {
        int[] inArray = {1, 2, 3, 4, 5};
        String expected = "2 4 ";
        IArraysOperation forPrint = new ForOperation();
        Assertions.assertEquals(expected, forPrint.viaEl(inArray));
    }
    @Test
    public void testInterface33() {
        int [] inArray = {1, 2, 3, 4, 5};
        String expected = "5 4 3 2 1 ";
        IArraysOperation forPrint = new ForOperation();
        Assertions.assertEquals(expected, forPrint.reverseEl(inArray));
    }
    @Test
    public void testInterfac41() {
        int [] inArray = {1, 2, 3, 4, 5};
        String expected = "1 2 3 4 5 ";
        IArraysOperation forPrint = new ForEachOperation();
        Assertions.assertEquals(expected, forPrint.printArray(inArray));
    }
    @Test
    public void testInterface42() {
        int[] inArray = {1, 2, 3, 4, 5};
        String expected = "2 4 ";
        IArraysOperation forPrint = new ForEachOperation();
        Assertions.assertEquals(expected, forPrint.viaEl(inArray));
    }
    @Test
    public void testInterface43() {
        int [] inArray = {1, 2, 3, 4, 5};
        String expected = "5 4 3 2 1 ";
        IArraysOperation forPrint = new ForEachOperation();
        Assertions.assertEquals(expected, forPrint.reverseEl(inArray));
    }
}
