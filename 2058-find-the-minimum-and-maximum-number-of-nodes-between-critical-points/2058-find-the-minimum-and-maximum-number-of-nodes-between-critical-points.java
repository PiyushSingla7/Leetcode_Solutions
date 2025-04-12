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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode previous = head, current = head.next, nextNode = head.next.next;
        int idx = 1, first = -1, last = -1;
        int[] arr = { -1, -1 };
        int minDistance = Integer.MAX_VALUE;
        while (nextNode != null) {
            if (current.val > previous.val && current.val > nextNode.val
                    || current.val < previous.val && current.val < nextNode.val) {
                if (first == -1)
                    first = idx;
                else
                    minDistance = Math.min(minDistance, idx - last);
                last = idx;
            }
            current = current.next;
            previous = previous.next;
            nextNode = nextNode.next;
            idx++;
        }
        if (first == last)
            return arr;
        int maxDistance = last - first;
        arr[0] = minDistance;
        arr[1] = maxDistance;
        return arr;
    }
}