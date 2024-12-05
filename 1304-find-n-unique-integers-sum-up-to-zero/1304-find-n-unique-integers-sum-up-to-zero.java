class Solution {
    public int[] sumZero(int n) {
        int result[] = new int[n];
        if (n == 1) {
            result[0] = 0;
            return result;
        }
        int sum = ((n) * (n - 1)) / 2;
        result[0] = -sum;
        for (int i = 1; i < n; i++) {
            result[i] = i;
        }
        return result;
    }
}