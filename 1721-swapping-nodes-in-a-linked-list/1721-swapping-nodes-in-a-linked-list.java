class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode first = head;
        for (int i = 1; i < k; i++)
            first = first.next;
        ListNode frontNode = first;
        ListNode second = head;
        while (first.next != null) {
            first = first.next;
            second = second.next;
        }
        int temp = frontNode.val;
        frontNode.val = second.val;
        second.val = temp;
        return head;
    }
}
