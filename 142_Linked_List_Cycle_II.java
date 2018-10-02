/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return null;
        }
        if (head.next == head) {
            return head;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast!=null&&fast.next!=null&&slow!=null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast==slow) {
                break;
            }
        }
        if (fast!=slow) {
            return null;
        }
        fast = head;
        while (fast!=slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }
}
