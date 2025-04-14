class Solution {
    public int getDecimalValue(ListNode head) {
        StringBuilder binary = new StringBuilder();
        while (head != null) {
            binary.append(head.val); 
            head = head.next;
        }
        int ans = 0;
        int power = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            int digit = binary.charAt(i) - '0';
            ans += digit * Math.pow(2, power++);
        }
        return ans;
    }
}
