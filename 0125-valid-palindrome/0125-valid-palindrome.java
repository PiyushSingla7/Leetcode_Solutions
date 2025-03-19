class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if (((int) s.charAt(i)) >= 97 && ((int) s.charAt(i)) <= 122) {
                str.append(s.charAt(i));
            }
        }
        return str.toString().toLowerCase().equals(str.reverse().toString().toLowerCase());
    }
}