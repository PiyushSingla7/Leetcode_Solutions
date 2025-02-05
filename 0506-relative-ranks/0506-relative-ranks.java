class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] result = new String[n];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(score[i], i);
        }
        int[] sortedScores = Arrays.copyOf(score, n);
        Arrays.sort(sortedScores);
        for (int i = n - 1; i >= 0; i--) {
            int currentScore = sortedScores[i];
            int index = map.get(currentScore);
            int rank = n - i;
            if (rank == 1) {
                result[index] = "Gold Medal";
            } else if (rank == 2) {
                result[index] = "Silver Medal";
            } else if (rank == 3) {
                result[index] = "Bronze Medal";
            } else {
                result[index] = String.valueOf(rank);
            }
        }
        return result;
    }
}