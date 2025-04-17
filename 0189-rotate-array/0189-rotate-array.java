class Solution {
    public void rotatepart(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }

    public void rotate(int[] nums, int k) {
        k %= nums.length;
        rotatepart(nums, 0, nums.length - k - 1);
        rotatepart(nums, nums.length - k, nums.length - 1);
        rotatepart(nums, 0, nums.length - 1);
    }
}