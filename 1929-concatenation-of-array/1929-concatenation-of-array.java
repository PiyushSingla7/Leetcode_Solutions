class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] result = new int[2 * nums.length];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            result[j++] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            result[j++] = nums[i];
        }
        return result;
    }
}