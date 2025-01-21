class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for (int ele : nums)
            sum += ele;
        int reqsum = (n * (n + 1)) / 2;
        return reqsum - sum;
    }
}