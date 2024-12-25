class Solution {
    public String countAndSay(int n) {
        if (n == 1)
            return "1";
        String s = countAndSay(n - 1);
        String ans = "";
        int i = 0;
        for (int k = 0; k < s.length(); k++) {
            if (s.charAt(i) == s.charAt(k)) {
                continue;
            } else {
                ans += (k - i) + "" + s.charAt(i);
                i = k;
            }
        }
        ans += (s.length() - i) + "" + s.charAt(i);
        return ans;
    }
}