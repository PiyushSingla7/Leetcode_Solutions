class Solution {
    public int compress(char[] arr) {
        String ans = "";
        int i = 0, j = 0;
        while (j < arr.length) {
            if (arr[j] == arr[i])
                j++;
            else {
                ans += arr[i];
                if ((j - i) > 1) {
                    ans += (j - i);
                }
                i = j;
            }
        }
        ans += arr[i];
        if ((j - i) > 1) {
            ans += (j - i);
        }
        for (int k = 0; k < ans.length(); k++) {
            arr[k] = ans.charAt(k);
        }
        return ans.length();
    }
}