class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer>[] bucket = new List[nums.length + 1];
        for (int ele : nums)
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        for (int ele : map.keySet()) {
            int val = map.get(ele);
            if (bucket[val] == null) {
                bucket[val] = new ArrayList<>();
            }
            bucket[val].add(ele);
        }
        int[] ans = new int[k];
        int idx = 0;
        for (int i = bucket.length - 1; i >= 0; i--) {
            if (bucket[i] != null) {
                for (int j = 0; j < bucket[i].size() && idx < k; j++) {
                    ans[idx] = bucket[i].get(j);
                    idx++;
                }
            }
        }
        return ans;
    }
}