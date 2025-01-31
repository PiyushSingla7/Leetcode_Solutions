class Solution {
    public long[] findPrefixScore(int[] nums) {
        long max = Long.MIN_VALUE;
        long[] prefixArr = new long[nums.length];
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            if (i == 0)
                prefixArr[i] = nums[i] + max;
            else
                prefixArr[i] = nums[i] + max + prefixArr[i - 1];
        }
        return prefixArr;
    }
}