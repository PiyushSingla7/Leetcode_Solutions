class Solution {
    public int[] runningSum(int[] nums) {
        int[] prefixsum = new int[nums.length];
        prefixsum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefixsum[i] = nums[i] + prefixsum[i - 1];
        }
        return prefixsum;
    }
}