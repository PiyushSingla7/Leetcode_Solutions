class Solution {
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public int removeElement(int[] nums, int val) {
        int k = nums.length - 1, i = 0;
        while (k >= 0 && nums[k] == val)
            k--;
        while (i <= k) {
            if (nums[i] == val) {
                swap(nums, i, k);
                k--;
            } else
                i++;
        }
        return k + 1;
    }
}