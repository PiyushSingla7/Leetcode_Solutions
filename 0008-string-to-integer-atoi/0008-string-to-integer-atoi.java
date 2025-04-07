class Solution {
    public int myAtoi(String s) {
        s = s.trim(); 
        if (s.length() == 0) return 0;
        int index = 0;
        int sign = 1;
        long num = 0;
        if (s.charAt(index) == '+' || s.charAt(index) == '-') {
            sign = s.charAt(index) == '-' ? -1 : 1;
            index++;
        }
        while (index < s.length() && Character.isDigit(s.charAt(index))) {
            num = num * 10 + (s.charAt(index) - '0');
            if (sign == 1 && num > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (sign == -1 && -num < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            index++;
        }
        return (int) num * sign;
    }
}