class Solution {
    public void sortColors(int[] nums) {
        int noo = 0;
        int noz = 0;
        for (int ele : nums) {
            if (ele == 0)
                noz++;
            else if (ele == 1)
                noo++;
        }
        for (int i = 0; i < nums.length; i++) {
            if (i < noz)
                nums[i] = 0;
            else if (i >= noz && i < noz + noo)
                nums[i] = 1;
            else
                nums[i] = 2;
        }
    }
}