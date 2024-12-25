class Solution {
    public String countAndSay(int n) {
        if (n == 1)
            return "1";
        String s = countAndSay(n - 1);
        StringBuilder ans = new StringBuilder();
        int i = 0;
        for (int k = 0; k < s.length(); k++) {
            if (s.charAt(i) == s.charAt(k)) {
                continue;
            } else {
                ans.append(k - i).append(s.charAt(i));
                i = k;
            }
        }
        ans.append(s.length() - i).append(s.charAt(i));
        return ans.toString();
    }
}