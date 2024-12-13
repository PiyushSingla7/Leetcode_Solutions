class Solution {
    public boolean thres(int[] nums, int d, int threshold) {
        int n = nums.length, sum = 0;
        if (d == 0)
            return false;
        for (int i = 0; i < n; i++) {
            if (nums[i] % d == 0)
                sum += nums[i] / d;
            else
                sum += nums[i] / d + 1;
        }
        if (sum <= threshold)
            return true;
        return false;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length, mx = Integer.MIN_VALUE;
        int d = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            mx = Math.max(mx, nums[i]);
        }
        int low = 0, high = mx;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (thres(nums, mid, threshold)) {
                d = Math.min(d, mid);
                high = mid - 1;
            } else
                low = mid + 1;
        }
        return d;
    }
}