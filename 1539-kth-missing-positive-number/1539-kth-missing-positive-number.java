class Solution {
    public int findKthPositive(int[] arr, int k) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if ((arr[mid] - (mid + 1)) < k)
                low = mid + 1;
            else
                high = mid - 1;
        }
        // int extra=k-(arr[high]-(high+1));
        // return arr[high]+extra;
        return k + low;
    }
}