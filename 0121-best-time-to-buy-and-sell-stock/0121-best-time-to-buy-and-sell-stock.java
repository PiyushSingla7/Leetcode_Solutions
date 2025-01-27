class Solution {
    public int maxProfit(int[] prices) {
        int minprice = prices[0];
        int currprofit = 0;
        int maxprofit = 0;
        for (int ele : prices) {
            minprice = Math.min(minprice, ele);
            currprofit = ele - minprice;
            maxprofit = Math.max(maxprofit, currprofit);
        }
        return maxprofit;
    }
}