class Solution {
    public List<Integer> spiralOrder(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        List<Integer> result = new ArrayList<>();
        int minr = 0, minc = 0, maxr = rows - 1, maxc = cols - 1;
        while (minr <= maxr && minc <= maxc) {
            for (int j = minc; j <= maxc; j++) {
                result.add(grid[minr][j]);
            }
            minr++;
            if ((minr > maxr || minc > maxc))
                break;
            for (int j = minr; j <= maxr; j++) {
                result.add(grid[j][maxc]);
            }
            maxc--;
            if ((minr > maxr || minc > maxc))
                break;
            for (int j = maxc; j >= minc; j--) {
                result.add(grid[maxr][j]);
            }
            maxr--;
            if ((minr > maxr || minc > maxc))
                break;
            for (int j = maxr; j >= minr; j--) {
                result.add(grid[j][minc]);
            }
            minc++;
        }
        return result;
    }
}