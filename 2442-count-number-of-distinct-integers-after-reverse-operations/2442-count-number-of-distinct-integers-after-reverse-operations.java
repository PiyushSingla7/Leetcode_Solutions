class Solution {
    public int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            int d = n % 10;
            rev = rev * 10 + d;
            n = n / 10;
        }
        return rev;
    }

    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int ele : nums) {
            set.add(ele);
            set.add(reverse(ele));
        }
        return set.size();
    }
}