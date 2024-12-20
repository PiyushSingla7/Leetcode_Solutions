class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int n = digits.length;
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> a = new HashMap<>();
        for (int ele : digits) {
            a.put(ele, a.getOrDefault(ele, 0) + 1);
        }
        for (int i = 100; i < 999; i += 2) {
            int x = i;
            int c = x % 10;
            x /= 10;
            int b = x % 10;
            x /= 10;
            int z = x % 10;
            x /= 10;
            if (a.containsKey(c)) {
                int val1 = a.get(c);
                a.put(c, val1 - 1);
                if (val1 == 1)
                    a.remove(c);
                if (a.containsKey(b)) {
                    int val2 = a.get(b);
                    a.put(b, val2 - 1);
                    if (val2 == 1)
                        a.remove(b);
                    if (a.containsKey(z)) {
                        result.add(i);
                    }
                    a.put(b, val2);
                }
                a.put(c, val1);
            }
        }
        int[] ans = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }
        return ans;
    }
}