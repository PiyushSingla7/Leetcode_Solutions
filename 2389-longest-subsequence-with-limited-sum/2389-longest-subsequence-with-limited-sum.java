class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int[] result = new int[queries.length];
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++)
            nums[i] = nums[i] + nums[i - 1];
        for (int i = 0; i < queries.length; i++)
            result[i] = binarysearch(nums, queries[i]);
        return result;
    }

    public int binarysearch(int[] nums, int ans) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] <= ans)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return low;
    }
}