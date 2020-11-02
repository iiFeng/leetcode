import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxAreaOfIslandTest {
    @Test
    public void test() {
        int[][] grid = {
                {0, 1, 0, 1},
                {1, 1, 0, 1}
        };
        assertEquals(3, MaxAreaOfIsland.maxAreaOfIsland(grid));
    }

    @Test
    public void test1() {
        int[][] grid1 = {
                {0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0}
        };
        assertEquals(7, MaxAreaOfIsland.maxAreaOfIsland(grid1));
    }
}