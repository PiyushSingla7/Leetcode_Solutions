import java.util.Arrays;

class Solution {
    static int[] dp;

    public int mincost(int[] dp, int[] cost, int idx) {
        if (idx == 0 || idx == 1)
            return cost[idx];
        if (dp[idx] != -1)
            return dp[idx];
        dp[idx] = cost[idx] + Math.min(mincost(dp, cost, idx - 1), mincost(dp, cost, idx - 2));
        return dp[idx];
    }

    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        dp = new int[n];
        Arrays.fill(dp, -1);
        return Math.min(mincost(dp, cost, n - 1), mincost(dp, cost, n - 2));
    }
}
