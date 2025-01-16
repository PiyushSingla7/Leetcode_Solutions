class Solution {
    public int reverse(int x) {
        boolean isNegative = x < 0;
        StringBuilder sb = new StringBuilder(String.valueOf(Math.abs((long) x))); 
        long reversed = Long.parseLong(sb.reverse().toString());
        if (isNegative) reversed = -reversed;
        if (reversed < Integer.MIN_VALUE || reversed > Integer.MAX_VALUE) return 0; 
        return (int) reversed; 
    }
}