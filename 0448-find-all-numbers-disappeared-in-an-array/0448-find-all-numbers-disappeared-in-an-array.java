class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for (int key : nums)
            set.add(key);
        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i))
                result.add(i);
        }
        return result;
    }
}