class Solution {
    public int countMatches(List<List<String>> items, String rulekey, String ruleValue) {
        int count = 0;
        int t;
        if (rulekey.equals("type"))
            t = 0;
        else if (rulekey.equals("color"))
            t = 1;
        else
            t = 2;
        for (int i = 0; i < items.size(); i++) {
            if ((items.get(i).get(t)).equals(ruleValue))
                count++;
        }
        return count;
    }
}