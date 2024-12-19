class Solution {
    public int check(int[] weight, int mid) {
        int days = 1;
        int currentWeight = 0;
        for (int w : weight) {
            if (currentWeight + w <= mid) {
                currentWeight += w;
            } else {
                currentWeight = w;
                days++;
            }
        }
        return days;
    }

    public int shipWithinDays(int[] weight, int days) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i : weight) {
            max = Math.max(max, i);
            sum += i;
        }
        int low = max, high = sum;
        int ans = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (check(weight, mid) <= days) {
                ans = mid;
                high = mid - 1;
            } else
                low = mid + 1;
        }
        return ans;
    }
}