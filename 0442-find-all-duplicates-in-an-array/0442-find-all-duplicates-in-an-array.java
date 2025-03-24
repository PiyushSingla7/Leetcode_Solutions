class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        for (int ele : nums) {
            if (set.contains(ele))
                result.add(ele);
            set.add(ele);
        }
        return result;
    }
}