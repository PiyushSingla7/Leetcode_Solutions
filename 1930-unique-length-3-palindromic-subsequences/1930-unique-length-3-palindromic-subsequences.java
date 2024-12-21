class Solution {
    public int countPalindromicSubsequence(String s) {
        HashMap<Character, Integer> fmap = new HashMap<>();
        HashMap<Character, Integer> lmap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!fmap.containsKey(ch))
                fmap.put(ch, i);
            lmap.put(ch, i);
        }

        int count = 0;
        for (char ele : fmap.keySet()) {
            HashSet<Character> a = new HashSet<>();
            int idx1 = fmap.get(ele);
            int idx2 = lmap.get(ele);
            for (int i = idx1 + 1; i < idx2; i++) {
                a.add(s.charAt(i));
            }
            count += a.size();
        }
        return count;
    }
}