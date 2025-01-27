class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int ele : nums)
            set.add(ele);
        int maxcount = 0;
        for (int ele : set) {
            if (!set.contains(ele - 1)) {
                int currcount = 1;
                int currnum = ele;
                while (set.contains(currnum + 1)) {
                    currcount++;
                    currnum++;
                }
                maxcount = Math.max(maxcount, currcount);
            }
        }
        return maxcount;
    }
}