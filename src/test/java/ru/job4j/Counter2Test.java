package ru.job4j;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Counter2Test {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter2.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }
    @Test
    public void whenSumNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter2.sum(start, finish);
        int expected = 55;
        Assert.assertEquals(expected, result);
    }
}