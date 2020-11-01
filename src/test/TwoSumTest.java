package test;

import org.junit.Test;

import solution.TwoSum;

import static org.junit.Assert.assertArrayEquals;

public class TwoSumTest {

    @Test
    public void test() {
        int[] data = new int[]{3, 2, 4};
        int[] expected = new int[]{1, 2};
        assertArrayEquals(expected, TwoSum.twoSum(data, 6));
    }

    @Test
    public void test1() {
        int[] data = new int[]{2, 7, 11, 15};
        int[] expected = new int[]{0, 1};
        assertArrayEquals(expected, TwoSum.twoSum(data, 9));
    }
}