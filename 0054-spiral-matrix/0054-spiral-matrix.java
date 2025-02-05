class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<>();
        int minr = 0, minc = 0, maxr = matrix.length - 1, maxc = matrix[0].length - 1;
        while (minc <= maxc && minr <= maxr) {
            // left
            for (int i = minc; i <= maxc; i++) {
                result.add(matrix[minr][i]);
            }
            minr++;

            // down
            if (minr > maxr || minc > maxc)
                break;
            for (int i = minr; i <= maxr; i++) {
                result.add(matrix[i][maxc]);
            }
            maxc--;

            // right
            if (minr > maxr || minc > maxc)
                break;
            for (int i = maxc; i >= minc; i--) {
                result.add(matrix[maxr][i]);
            }
            maxr--;

            // up
            if (minr > maxr || minc > maxc)
                break;
            for (int i = maxr; i >= minr; i--) {
                result.add(matrix[i][minc]);
            }
            minc++;
        }
        return result;
    }
}