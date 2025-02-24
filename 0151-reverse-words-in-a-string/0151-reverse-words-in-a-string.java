class Solution {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        String[] temp = s.trim().split("\\s+");
        for (int i = temp.length - 1; i >= 0; i--) {
            result.append(temp[i]).append(" ");
        }
        return result.toString().trim();
    }
}