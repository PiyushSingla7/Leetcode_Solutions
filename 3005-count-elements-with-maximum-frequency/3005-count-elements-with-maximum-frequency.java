class Solution {
    public int maxFrequencyElements(int[] nums) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int ele : nums) {
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }
        int max = Collections.max(map.values());
        for (int ele : map.keySet()) {
            int val = map.get(ele);
            if (val == max)
                count += val;
        }
        return count;
    }
}