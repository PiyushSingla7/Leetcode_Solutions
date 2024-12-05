class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length, n = mat[0].length;
        if (m * n != r * c) {
            return mat;
        }
        int[][] result = new int[r][c];
        List<Integer> ans = new ArrayList<>();
        for (int[] row : mat) {
            for (int num : row) {
                ans.add(num);
            }
        }
        int k = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                result[i][j] = ans.get(k++);
            }
        }
        return result;
    }
}