class Solution {
    public static void swap(int[][] grid, int i, int j) {
        int temp = grid[i][j];
        grid[i][j] = grid[j][i];
        grid[j][i] = temp;
    }

    public static void reverse(int[][] grid, int i) {
        int low = 0;
        int high = grid[i].length - 1;
        while (low < high) {
            int temp = grid[i][low];
            grid[i][low] = grid[i][high];
            grid[i][high] = temp;
            low++;
            high--;
        }
    }

    public void rotate(int[][] grid) {
        int rows, cols;
        rows = cols = grid.length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i; j++) {
                swap(grid, i, j);
            }
        }
        for (int i = 0; i < rows; i++) {
            reverse(grid, i);
        }
    }
}