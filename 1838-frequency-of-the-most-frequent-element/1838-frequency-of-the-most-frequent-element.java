class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0, right = 0;
        long res = 0, total = 0;
        while (right < nums.length) {
            total += nums[right];
            while (((long) nums[right]) * (right - left + 1) > total + k) {
                total -= nums[left];
                left += 1;
            }
            res = Math.max(res, right - left + 1);
            right += 1;
        }
        return (int) res;
    }
}