class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length, reqsum = (n * (n + 1)) / 2, sum = 0;
        for (int i : nums)
            sum += i;
        return reqsum - sum;
    }
}