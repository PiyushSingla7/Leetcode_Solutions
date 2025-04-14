class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> n1 = new HashMap<>();
        HashMap<Integer, Integer> n2 = new HashMap<>();
        for (int key : nums1)
            n1.put(key, n1.getOrDefault(key, 0) + 1);
        for (int key : nums2)
            n2.put(key, n2.getOrDefault(key, 0) + 1);
        for (int key : n1.keySet()) {
            if (n2.containsKey(key)) {
                int occurrences = Math.min(n1.get(key), n2.get(key));
                for (int i = 0; i < occurrences; i++) {
                    result.add(key);
                }
            }
        }
        int[] res = new int[result.size()];
        for (int i = 0; i < result.size(); i++)
            res[i] = result.get(i);
        return res;
    }
}