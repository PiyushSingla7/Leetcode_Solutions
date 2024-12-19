class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
            set.add(Integer.parseInt(new StringBuilder().append(num).reverse().toString()));
        }
        return set.size();
    }
}