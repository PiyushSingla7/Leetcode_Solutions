class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] result = new int[nums.length];
        int posIndex = 0, negIndex = 1;
        for (int ele : nums) {
            if (ele >= 0) {
                result[posIndex] = ele;
                posIndex += 2;
            } else {
                result[negIndex] = ele;
                negIndex += 2;
            }
        }
        return result;
    }
}
