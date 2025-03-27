class Solution {
    public int majorityElement(int[] nums) {
        int freq = 0, num = 0;
        for (int ele : nums) {
            if (freq == 0)
                num = ele;
            if (num == ele)
                freq++;
            else
                freq--;
        }
        return num;
    }
}