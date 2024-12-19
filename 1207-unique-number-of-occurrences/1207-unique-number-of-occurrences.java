class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> a = new HashMap<>();
        HashSet<Integer> b = new HashSet<>();
        for (int ele : arr) {
            a.put(ele, a.getOrDefault(ele, 0) + 1);
        }
        for (int val : a.values()) {
            if (b.contains(val))
                return false;
            else
                b.add(val);
        }
        return true;
    }
}