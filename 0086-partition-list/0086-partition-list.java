/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode temp = head;
        ListNode a = new ListNode(-1);
        ListNode b = new ListNode(-1);
        ListNode l1 = a, l2 = b;
        while (temp != null) {
            if (temp.val < x) {
                a.next = temp;
                a = a.next;
            } else {
                b.next = temp;
                b = b.next;
            }
            temp = temp.next;
        }
        b.next = null;
        a.next = l2.next;
        return l1.next;
    }
}