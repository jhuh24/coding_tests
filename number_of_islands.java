class Solution {
    public int numIslands(char[][] grid) {
        int len = grid[0].length;
        int width = grid.length;
        int count = 0;
        for (int j = 0; j < width; j++) {
            for (int i = 0; i < len; i++) {
                char curr = grid[j][i];
                if (curr == '0') {
                    continue;
                }
                else if (curr == '2') {
                    continue;
                }
                else {
                    boolean island = true;
                    if (j - 1 >= 0) {
                        if (grid[j - 1][i] == '2') {
                            island = false;
                        }
                    }
                    if (j + 1 < width) {
                        if (grid[j + 1][i] == '2') {
                            island = false;
                        }
                    }
                    if (i - 1 >= 0) {
                        if (grid[j][i - 1] == '2') {
                            island = false;
                        }
                    }
                    if (i + 1 < len) {
                        if (grid[j][i + 1] == '2') {
                            island = false;
                        }
                    }
                    grid[j][i] = '2';
                    infect(grid, j, i, len, width);
                    if (island == true) {
                        count += 1;
                    }
                }
            }
        }
        return count;
    }

    public void infect(char[][] grid, int j, int i, int len, int width) {
        if (i < 0 || i >= len) {
            return;
        }
        if (j < 0 || j >= width) {
            return;
        }
        if (j - 1 >= 0) {
            if (grid[j - 1][i] == '1') {
                grid[j - 1][i] = '2';
                infect(grid, j - 1, i, len, width);
            }
        }
        if (j + 1 < width) {
            if (grid[j + 1][i] == '1') {
                grid[j + 1][i] = '2';
                infect(grid, j + 1, i, len, width);
            }
        }
        if (i - 1 >= 0) {
            if (grid[j][i - 1] == '1') {
                grid[j][i - 1] = '2';
                infect(grid, j, i - 1, len, width);
            }
        }
        if (i + 1 < len) {
            if (grid[j][i + 1] == '1') {
                grid[j][i + 1] = '2';
                infect(grid, j, i + 1, len, width);
            }
        }
    }
}