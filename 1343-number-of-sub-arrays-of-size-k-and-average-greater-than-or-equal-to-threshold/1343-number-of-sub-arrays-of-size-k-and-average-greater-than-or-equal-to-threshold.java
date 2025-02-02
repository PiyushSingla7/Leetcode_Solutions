class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int currsum = 0, count = 0;
        for (int i = 0; i < k; i++) {
            currsum += arr[i];
        }
        if (currsum >= threshold * k)
            count++;
        for (int i = k; i < arr.length; i++) {
            currsum = currsum + arr[i] - arr[i - k];
            if (currsum >= threshold * k)
                count++;
        }
        return count;
    }
}