package test;

import org.junit.Test;
import solution.ThreeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ThreeSumTest {
    @Test
    public void test() {
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(Arrays.asList(-1, -1, 2)));
        expected.add(new ArrayList<>(Arrays.asList(-1, 0, 1)));
        int[] data = new int[]{-1, 0, 1, 2, -1, -4};
        assertEquals(expected, ThreeSum.threeSum(data));
    }

    @Test
    public void test1() {
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(Arrays.asList(-4,-2,6)));
        expected.add(new ArrayList<>(Arrays.asList(-4,0,4)));
        expected.add(new ArrayList<>(Arrays.asList(-4,1,3)));
        expected.add(new ArrayList<>(Arrays.asList(-4,2,2)));
        expected.add(new ArrayList<>(Arrays.asList(-2,-2,4)));
        expected.add(new ArrayList<>(Arrays.asList(-2,0,2)));
        int[] data = new int[]{-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6};
        assertEquals(expected, ThreeSum.threeSum(data));
    }
}