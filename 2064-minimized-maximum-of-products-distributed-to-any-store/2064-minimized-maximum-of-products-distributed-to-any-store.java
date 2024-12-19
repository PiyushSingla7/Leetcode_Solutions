class Solution {
    public boolean isPossible(int mid, int[] quant, int n) {
        int stores = 0;
        for (int i : quant) {
            if (i % mid == 0)
                stores += (i / mid);
            else
                stores = stores + (i / mid) + 1;
        }
        if (stores <= n)
            return true;
        else
            return false;
    }

    public int minimizedMaximum(int n, int[] quant) {
        int m = quant.length;
        int max = Integer.MIN_VALUE;
        for (int i : quant) {
            max = Math.max(max, i);
        }
        int low = 1, high = max;
        int ans = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(mid, quant, n)) {
                ans = mid;
                high = mid - 1;
            } else
                low = mid + 1;
        }
        return ans;
    }
}