class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int low = 0, high = n - 1, mid = 0;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if ((mid != 0 && mid != n - 1) && (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]))
                return mid;
            else if ((mid != 0 && mid != n - 1) && (arr[mid] > arr[mid - 1] && arr[mid] < arr[mid + 1]))
                low = mid + 1;
            else
                high = mid - 1;
        }
        return mid + 1;
    }
}