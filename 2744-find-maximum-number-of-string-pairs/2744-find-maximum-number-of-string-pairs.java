class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        HashSet<String> set = new HashSet<>();
        int c = 0;
        for (String temp : words) {
            if (set.contains(new StringBuilder().append(temp).reverse().toString()))
                c++;
            set.add(temp);
        }
        return c;
    }
}