class Solution {
    public boolean canArrange(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int ele : arr) {
            int i = ele % k;
            if (i < 0)
                i += k;
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        if (map.containsKey(0)) {
            if (map.get(0) % 2 != 0)
                return false;
            map.remove(0);
        }
        for (int ele : map.keySet()) {
            if (!map.containsKey(k - ele))
                return false;
            int val1 = map.get(ele);
            int val2 = map.get(k - ele);
            if (val1 != val2)
                return false;
        }
        return true;
    }
}