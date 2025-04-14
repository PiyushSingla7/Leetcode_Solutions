class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length, n2 = nums2.length, i = 0, j = 0, k = 0;
        int[] merged = new int[n1 + n2];
        while (i < n1 && j < n2) {
            if (nums1[i] <= nums2[j])
                merged[k++] = nums1[i++];
            else
                merged[k++] = nums2[j++];
        }
        while (i < n1)
            merged[k++] = nums1[i++];
        while (j < n2)
            merged[k++] = nums2[j++];
        int len = merged.length;
        if (len % 2 == 0)
            return (merged[len / 2] + merged[len / 2 - 1]) / 2.0;
        else
            return merged[len / 2];
    }
}
