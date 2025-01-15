class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int ele : nums) {
            if (map.containsKey(k - ele)) {
                count++;
                int val = map.get(k - ele);
                if (val <= 1)
                    map.remove(k - ele);
                else
                    map.put(k - ele, val - 1);
            } else {
                map.put(ele, map.getOrDefault(ele, 0) + 1);
            }
        }
        return count;
    }
}