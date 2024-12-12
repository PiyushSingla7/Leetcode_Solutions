class Solution {
    public int[] searchRange(int[] arr, int target) {
        int[] ans = { -1, -1 };
        int n = arr.length;
        int low = 0, high = n - 1;
        boolean flag = false;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                flag = true;
                break;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else
                low = mid + 1;
        }
        if (flag) {
            low = 0;
            high = n - 1;
            int lb = n;
            while (low <= high) {
                int mid = (low) + (high - low) / 2;
                if (arr[mid] >= target) {
                    lb = Math.min(lb, mid);
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            ans[0] = lb;
            low = 0;
            high = n - 1;
            int ub = n;
            while (low <= high) {
                int mid = (low) + (high - low) / 2;
                if (arr[mid] > target) {
                    ub = Math.min(ub, mid);
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            ans[1] = ub - 1;
            return ans;
        } else
            return ans;
    }
}