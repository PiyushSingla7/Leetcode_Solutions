class Solution {
    public int countPrimes(int n) {
        if (n <= 2)
            return 0;
        int[] check = new int[n];
        Arrays.fill(check, 1);
        check[0] = 0;
        check[1] = 0;
        for (int i = 2; i * i < n; i++) {
            if (check[i] == 1) {
                for (int j = i * i; j < n; j += i) {
                    check[j] = 0;
                }
            }
        }
        int count = 0;
        for (int ele : check) {
            if (ele == 1)
                count++;
        }
        return count;
    }
}