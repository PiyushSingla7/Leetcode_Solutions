class Solution {
    public int bestClosingTime(String customers) {
        int maxpenalty = 0, minpenalty = 0, idx = 0;
        for (char ch : customers.toCharArray()) {
            if (ch == 'Y')
                maxpenalty++;
        }
        minpenalty = maxpenalty;
        for (int i = 0; i < customers.length(); i++) {
            if (customers.charAt(i) == 'Y')
                maxpenalty--;
            else
                maxpenalty++;
            if (minpenalty > maxpenalty) {
                minpenalty = maxpenalty;
                idx = i + 1;
            }
        }
        return idx;
    }
}