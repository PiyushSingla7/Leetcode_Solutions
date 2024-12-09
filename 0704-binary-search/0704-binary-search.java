class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int low = 0, high = n - 1, idx = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                idx = mid;
                break;
            }
            if (nums[mid] > target)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return idx;
    }
}