class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int mx = 0, cc = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1)
                cc++;
            else {
                mx = Math.max(mx, cc);
                cc = 0;
            }
        }
        mx = Math.max(mx, cc);
        return mx;
    }
}