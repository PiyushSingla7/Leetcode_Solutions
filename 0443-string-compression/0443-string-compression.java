class Solution {
    public int compress(char[] arr) {
        StringBuilder ans = new StringBuilder("");
        int i = 0, j = 0;
        while (j < arr.length) {
            if (arr[j] == arr[i])
                j++;
            else {
                ans.append(arr[i]);
                if ((j - i) > 1) {
                    ans.append(j - i);
                }
                i = j;
            }
        }
        ans.append(arr[i]);
        if ((j - i) > 1) {
            ans.append(j - i);
        }
        for (int k = 0; k < ans.length(); k++) {
            arr[k] = ans.charAt(k);
        }
        return ans.length();
    }
}