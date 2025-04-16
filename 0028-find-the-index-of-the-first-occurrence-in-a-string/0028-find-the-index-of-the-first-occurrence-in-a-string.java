class Solution {
    public void filllps(int[] lps, String needle) {
        int pre = 0, suf = 1;
        while (suf < needle.length()) {
            if (needle.charAt(pre) == needle.charAt(suf)) {
                lps[suf] = pre + 1;
                suf++;
                pre++;
            } else {
                if (pre == 0) {
                    lps[suf] = 0;
                    suf++;
                } else 
                    pre = lps[pre - 1];
            }
        }
    }

    public int strStr(String haystack, String needle) {
        int[] lps = new int[needle.length()];
        filllps(lps, needle);
        int i = 0, j = 0;
        while (i < haystack.length() && j < needle.length()) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            } else {
                if (j != 0)
                    j = lps[j - 1];
                else
                    i += 1;
            }
        }
        return j == needle.length() ? i - j : -1;
    }
}