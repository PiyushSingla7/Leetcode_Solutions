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
        int lp = fp;
        int[] ans = { fp, lp };
        if (lp == -1) {
            return ans;
        }
        while (nums[lp] == target)
            lp++;
        ans[0] = fp;
        ans[1] = lp - 1;
        return ans;
    }
}