class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for (int i : nums)
            sum += i;
        int reqsum = (nums.length * (nums.length + 1)) / 2;
        return reqsum - sum;
    }
}