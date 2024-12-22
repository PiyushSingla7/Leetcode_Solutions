class Solution {
    private List<List<Integer>> result = new ArrayList<>();

    public void sub(int i, int[] arr, ArrayList<Integer> ans) {
        if (i == arr.length) {
            result.add(new ArrayList<>(ans));
            return;
        }
        sub(i + 1, arr, ans);
        ans.add(arr[i]);
        sub(i + 1, arr, ans);
        ans.remove(ans.size() - 1);
    }

    public List<List<Integer>> subsets(int[] nums) {
        result.clear();
        sub(0, nums, new ArrayList<>());
        return result;
    }
}