class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long currsum = 0, maxsum = Long.MIN_VALUE;
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < k; i++) {
            currsum += nums[i];
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        }
        if (freq.size() == k)
            maxsum = currsum;
        for (int i = k; i < nums.length; i++) {
            currsum += nums[i] - nums[i - k];
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
            freq.put(nums[i - k], freq.get(nums[i - k]) - 1);
            if (freq.get(nums[i - k]) == 0) {
                freq.remove(nums[i - k]);
            }
            if (freq.size() == k) {
                maxsum = Math.max(maxsum, currsum);
            }
        }
        return maxsum == Long.MIN_VALUE ? 0 : maxsum;
    }
}
