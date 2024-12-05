class Solution {
    public int findNumbers(int[] nums) {
        int c = 0;
        for (int ele : nums) {
            String str = Integer.toString(ele);
            if (str.length() % 2 == 0)
                c++;
        }
        return c;
    }
}