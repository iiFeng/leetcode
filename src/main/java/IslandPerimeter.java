/**
 * 463. Island Perimeter
 * You are given row x col grid representing a map where grid[i][j] = 1 represents land and grid[i][j] = 0 represents water.
 * <p>
 * Grid cells are connected horizontally/vertically (not diagonally). The grid is completely surrounded by water, and there is exactly one island (i.e., one or more connected land cells).
 * <p>
 * The island doesn't have "lakes", meaning the water inside isn't connected to the water around the island. One cell is a square with side length 1. The grid is rectangular, width and height don't exceed 100. Determine the perimeter of the island.
 */
public class IslandPerimeter {

    public static int islandPerimeter(int[][] grid) {
        int m, n;
        int result = 0;

        if (grid.length == 0 || grid[0].length == 0) return 0;
        m = grid.length;
        n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    result = dfs(grid, i, j);
                }
            }
        }
        return result;
    }

    public static int dfs(int[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length) return 1;
        if (grid[i][j] == 0) return 1;
        if (grid[i][j] != 1) return 0;
        grid[i][j] = 2;
        return dfs(grid, i + 1, j) +
                dfs(grid, i - 1, j) +
                dfs(grid, i, j + 1) +
                dfs(grid, i, j - 1);
    }
}