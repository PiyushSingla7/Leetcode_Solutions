class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;
        int[] mapST = new int[128];
        int[] mapTS = new int[128];
        for (int i = 0; i < s.length(); i++) {
            char chS = s.charAt(i);
            char chT = t.charAt(i);
            if (mapST[chS] == 0 && mapTS[chT] == 0) {
                mapST[chS] = chT;
                mapTS[chT] = chS;
            } else {
                if (mapST[chS] != chT || mapTS[chT] != chS) {
                    return false;
                }
            }
        }
        return true;
    }
}