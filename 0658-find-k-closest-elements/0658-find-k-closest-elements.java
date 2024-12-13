class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ans = new ArrayList<>();
        int n = arr.length;
        // Case 1: x is smaller than all elements
        if (x < arr[0]) {
            for (int i = 0; i < k; i++) {
                ans.add(arr[i]);
            }
            return ans;
        }
        // Case 2: x is larger than all elements
        else if (x > arr[n - 1]) {
            for (int i = n - k; i < n; i++) {
                ans.add(arr[i]);
            }
            return ans;
        }
        // Binary Search to find the lower bound (index of the first element >= x)
        int lb = n, low = 0, high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= x) {
                lb = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        // Two-pointer approach to find the closest elements
        int j = lb, i = lb - 1;
        while (k > 0 && i >= 0 && j < n) {
            int di = Math.abs(x - arr[i]);
            int dj = Math.abs(x - arr[j]);
            if (di <= dj) {
                ans.add(arr[i]);
                i--;
            } else {
                ans.add(arr[j]);
                j++;
            }
            k--;
        }
        // Add remaining elements if one side is exhausted
        while (i >= 0 && k > 0) {
            ans.add(arr[i]);
            i--;
            k--;
        }
        while (j < n && k > 0) {
            ans.add(arr[j]);
            j++;
            k--;
        }
        // Sort the result list to maintain the order of elements
        Collections.sort(ans);
        return ans;
    }
}
