/**
 * 200. Number of Islands
 * Given an m x n 2d grid map of '1's (land) and '0's (water), return the number of islands.
 * <p>
 * An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.
 */
public class NumberOfIslands {
    public static int numIslands(char[][] grid) {
        int m, n;
        int result = 0;
        if (grid.length <= 0 || grid[0].length <= 0) return 0;
        m = grid.length;
        n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    result += dfs(grid, i, j);
                }
            }
        }
        return result;
    }

    public static int dfs(char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length) return 0;
        if (grid[i][j] == '0') return 0;
        grid[i][j] = '0';
        dfs(grid, i - 1, j);
        dfs(grid, i + 1, j);
        dfs(grid, i, j - 1);
        dfs(grid, i, j + 1);
        return 1;
    }
}
