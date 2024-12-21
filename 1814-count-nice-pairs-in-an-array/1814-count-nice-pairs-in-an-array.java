class Solution {
    public int rev(int ele) {
        int rev = 0;
        while (ele > 0) {
            rev = rev * 10 + (ele % 10);
            ele /= 10;
        }
        return rev;
    }

    public int countNicePairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int ele : nums) {
            int f = ele - rev(ele);
            if (map.containsKey(f)) {
                int freq = map.get(f);
                count += freq;
                count %= 1000000007;
                map.put(f, freq + 1);
            } else {
                map.put(f, 1);
            }
        }
        return (int) (count % 1000000007);
    }
}