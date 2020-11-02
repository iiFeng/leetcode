import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberOfIslandsTest {
    @Test
    public void test() {
        char[][] grid = {
                {'0', '1', '0', '1'},
                {'1', '1', '0', '1'}
        };
        assertEquals(2, NumberOfIslands.numIslands(grid));
    }
    @Test
    public void test1() {
        char[][] grid1 = {
                {'0', '1', '0', '0'},
                {'1', '1', '1', '0'},
                {'0', '1', '0', '0'},
                {'1', '1', '0', '0'}
        };
        assertEquals(1, NumberOfIslands.numIslands(grid1));
    }
}