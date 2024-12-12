class Solution {
    public int mySqrt(int x) {
        long low = 0, high = (long) x;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            long a = mid * mid;
            if (a == (long) x)
                return (int) mid;
            else if (a > x)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return (int) high;
    }
}