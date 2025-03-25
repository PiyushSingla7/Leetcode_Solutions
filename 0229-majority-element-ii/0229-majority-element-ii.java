class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int ele : nums)
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        for (int ele : map.keySet())
            if (map.get(ele) > nums.length / 3)
                result.add(ele);
        return result;
    }
}