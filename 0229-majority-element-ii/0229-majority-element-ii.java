class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int ele1 = Integer.MIN_VALUE, ele2 = Integer.MIN_VALUE, cnt1 = 0, cnt2 = 0;
        for (int ele : nums) {
            if (ele == ele1)
                cnt1++;
            else if (ele == ele2)
                cnt2++;
            else if (cnt1 == 0) {
                ele1 = ele;
                cnt1 = 1;
            } else if (cnt2 == 0) {
                ele2 = ele;
                cnt2 = 1;
            } else {
                cnt1--;
                cnt2--;
            }
        }
        cnt1 = cnt2 = 0;
        for (int ele : nums) {
            if (ele == ele1)
                cnt1++;
            else if (ele == ele2)
                cnt2++;
        }
        List<Integer> result = new ArrayList<>();
        if (cnt1 > nums.length / 3)
            result.add(ele1);
        if (cnt2 > nums.length / 3)
            result.add(ele2);
        return result;
    }
}
