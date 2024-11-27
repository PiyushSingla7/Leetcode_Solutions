class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> result = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int ele : candies) {
            max = Math.max(max, ele);
        }
        for (int ele : candies) {
            if (ele + extraCandies >= max)
                result.add(true);
            else
                result.add(false);
        }
        return result;
    }
}