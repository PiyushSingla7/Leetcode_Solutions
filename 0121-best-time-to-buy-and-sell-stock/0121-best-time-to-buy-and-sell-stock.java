class Solution {
    public int maxProfit(int[] prices) {
        int low = prices[0],cp = 0;
        for (int ele : prices) {
            low = Math.min(low, ele);
            cp = Math.max(cp, ele - low);
        }
        return cp;
    }
}