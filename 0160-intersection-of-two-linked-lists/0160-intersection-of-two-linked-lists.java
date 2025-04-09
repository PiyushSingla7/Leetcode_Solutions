/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int l1 = 0, l2 = 0;
        ListNode temp = headA;
        while (temp != null) {
            temp = temp.next;
            l1++;
        }
        temp = headB;
        while (temp != null) {
            temp = temp.next;
            l2++;
        }
        while (l1 > l2) {
            headA = headA.next;
            l1--;
        }
        while (l2 > l1) {
            headB = headB.next;
            l2--;
        }
        while (headA != null && headB != null) {
            if (headA == headB)
                return headA;
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
}