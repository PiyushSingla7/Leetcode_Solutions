class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cc = 0, mc = 0;
        for (int i : nums) {
            if (i == 1)
                cc++;
            else {
                mc = Math.max(mc, cc);
                cc = 0;
            }
        }
        mc = Math.max(mc, cc);
        return mc;
    }
}