class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int low = 0, high = n - 1, fp = -1;
        while (low <= high) {
            int mid = (low) + (high - low) / 2;
            if (nums[mid] == target) {
                if (mid > 0 && nums[mid - 1] == target)
                    high = mid - 1;
                else {
                    fp = mid;
                    break;
                }
            } else if (nums[mid] > target)
                high = mid - 1;
            else
                low = mid + 1;
        }

        int lp = -1;
        low = 0;
        high = n - 1;
        while (low <= high) {
            int mid = (low) + (high - low) / 2;
            if (nums[mid] == target) {
                if (mid + 1 < n && nums[mid + 1] == target)
                    low = mid + 1;
                else {
                    lp = mid;
                    break;
                }
            } else if (nums[mid] > target)
                high = mid - 1;
            else
                low = mid + 1;
        }
        int[] ans = { fp, lp };
        return ans;
    }
}