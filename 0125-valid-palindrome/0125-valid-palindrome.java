class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            int a = s.charAt(i);
            if ((a >= 97 && a <= 122) || (a >= 48 && a <= 57)) {
                str.append(s.charAt(i));
            }
        }
        return str.toString().toLowerCase().equals(str.reverse().toString().toLowerCase());
    }
}