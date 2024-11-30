class Solution {
    public int matrixScore(int[][] grid) {
        int rows = grid.length, cols = grid[0].length;
        for (int i = 0; i < rows; i++) {
            if (grid[i][0] == 0) {
                for (int j = 0; j < cols; j++) {
                    if (grid[i][j] == 0)
                        grid[i][j] = 1;
                    else
                        grid[i][j] = 0;
                }
            }
        }
        for (int j = 1; j < cols; j++) {
            int noz = 0, noo = 0;
            for (int i = 0; i < rows; i++) {
                if (grid[i][j] == 0)
                    noz++;
                else
                    noo++;
            }
            if (noz > noo) {
                for (int i = 0; i < rows; i++) {
                    if (grid[i][j] == 0)
                        grid[i][j] = 1;
                    else
                        grid[i][j] = 0;
                }
            }
        }
        int ans = 0, x = 1;
        for (int j = cols - 1; j >= 0; j--) {
            for (int i = 0; i < rows; i++) {
                ans += (grid[i][j] * x);
            }
            x *= 2;
        }
        return ans;
    }
}