class Solution {
    public void rotatepart(int[] nums, int i, int j) {
        while (i < j) {
            int temp = nums[i];
            nums[i++] = nums[j];
            nums[j--] = temp;
        }
    }

    public void rotate(int[] nums, int k) {
        k %= nums.length;
        rotatepart(nums, 0, nums.length - k - 1);
        rotatepart(nums, nums.length - k, nums.length - 1);
        rotatepart(nums, 0, nums.length - 1);
    }
}