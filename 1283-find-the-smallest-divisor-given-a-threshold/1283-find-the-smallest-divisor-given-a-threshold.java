class Solution {
    public boolean thres(int[] nums, int d, int threshold) {
        int sum = 0;
        for (int num : nums) {
            sum += (num + d - 1) / d;
            if (sum > threshold) {
                return false;
            }
        }
        return true;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int mx = Integer.MIN_VALUE;
        for (int num : nums) {
            mx = Math.max(mx, num);
        }
        int low = 1, high = mx, d = mx;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (thres(nums, mid, threshold)) {
                d = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return d;
    }
}
