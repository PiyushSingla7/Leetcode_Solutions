class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int[] result = Arrays.stream(nums).distinct().toArray();
        return result.length >= 3 ? result[result.length - 3] : result[result.length - 1];
    }
}