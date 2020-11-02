/**
 * 695. Max Area of Island
 * Given a non-empty 2D array grid of 0's and 1's, an island is a group of 1's (representing land) connected 4-directionally (horizontal or vertical.) You may assume all four edges of the grid are surrounded by water.
 *
 * Find the maximum area of an island in the given 2D array. (If there is no island, the maximum area is 0.)
 *
 */
public class MaxAreaOfIsland {
    private static int count = 0;

    public static int maxAreaOfIsland(int[][] grid) {
        int m, n;
        int area = 0;
        if (grid.length <= 0 || grid[0].length <= 0) return 0;
        m = grid.length;
        n = grid[0].length;
        int max = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    area += dfs(grid, i, j);
                    max = Math.max(max, area);
                }
                area = 0;
                count = 0;
            }
        }
        return max;
    }

    public static int dfs(int[][] grid, int i, int j) {
        if (i < 0 || j < 0 | i >= grid.length || j >= grid[0].length) return 0;
        if (grid[i][j] == 0) {
            return 0;
        }
        count++;
        grid[i][j] = 0;
        dfs(grid, i - 1, j);
        dfs(grid, i + 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i, j - 1);
        return count;
    }
}
