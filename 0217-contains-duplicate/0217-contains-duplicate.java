class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int key : nums) {
            if (set.contains(key))
                return true;
            set.add(key);
        }
        return false;
    }
}