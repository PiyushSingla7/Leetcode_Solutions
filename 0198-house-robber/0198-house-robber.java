class Solution {
    static int[] dp;

    public int amount(int[] nums, int i, int[] dp) {
        if (i >= nums.length)
            return 0;
        if (dp[i] != -1)
            return dp[i];
        int take = nums[i] + amount(nums, i + 2, dp);
        int skip = amount(nums, i + 1, dp);
        return dp[i] = Math.max(take, skip);
    }

    public int rob(int[] nums) {
        dp = new int[nums.length];
        Arrays.fill(dp, -1);
        return amount(nums, 0, dp);

        // tabulation way
        // int n = arr.length;
        // if (n == 1)
        //     return nums[0];
        // int[] dp = new int[n];
        // dp[0] = nums[0];
        // dp[1] = Math.max(nums[0], nums[1]);
        // for (int i = 2; i < n; i++) {
        //     dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
        // }
        // return dp[n - 1];
    }
}