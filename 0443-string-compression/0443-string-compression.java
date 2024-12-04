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
        char[] arr2 = ans.toCharArray();
        for (int k = 0; k < arr2.length; k++) {
            arr[k] = arr2[k];
        }
        return ans.length();
    }
}