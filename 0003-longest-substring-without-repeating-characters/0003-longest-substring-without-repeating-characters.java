class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n <= 1)
            return n;
        int maxlen = 0, i = 0, j = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        while (j < n) {
            char ch = s.charAt(j);
            if (map.containsKey(ch) && map.get(ch) >= i) {
                maxlen = Math.max(maxlen, j - i);
                int val = map.get(ch);
                i = val + 1;
            }
            map.put(ch, j);
            j++;
        }
        maxlen = Math.max(maxlen, j - i);
        return maxlen;
    }
}