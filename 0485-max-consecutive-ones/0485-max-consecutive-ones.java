class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int cmax = 0;
        for (int ele : nums) {
            if (ele == 1)
                cmax++;
            else {
                max = Math.max(max, cmax);
                cmax = 0;
            }
        }
        max = Math.max(max, cmax);
        return max;
    }
}