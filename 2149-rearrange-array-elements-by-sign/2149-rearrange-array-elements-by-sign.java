class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] result = new int[nums.length];
        int posIdx = 0;
        int negIdx = 1;
        for (int ele : nums) {
            if (ele >= 0) {
                result[posIdx] = ele;
                posIdx += 2;
            } else {
                result[negIdx] = ele;
                negIdx += 2;
            }
        }
        return result;
    }
}