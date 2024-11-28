class Solution {
    public void reverse(int[][] nums, int i) {
        int k = 0;
        int l = nums[i].length - 1;
        for (int j = 0; j < nums[i].length / 2; j++) {
            int temp = nums[i][k];
            nums[i][k] = nums[i][l];
            nums[i][l] = temp;
            k++;
            l--;
        }
    }
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int m = image[0].length;
        for (int i = 0; i < n; i++) {
            reverse(image, i);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (image[i][j] == 0)
                    image[i][j] = 1;
                else
                    image[i][j] = 0;
            }
        }
        return image;
    }
}