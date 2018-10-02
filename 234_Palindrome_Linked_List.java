/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        int len = 0;
        if (head == null) {
            return true;
        }
        ListNode head1 = head;
        while (head1!=null) {
            len++;
            head1 = head1.next;
        }
        ListNode next = head;
        for (int i = 0; i < len/2-1; i++) {
            next = next.next;
        }
        ListNode next1 = next.next;
        ListNode pre = null;
        while (next1!=null) {
            ListNode nt = next1.next;
            next1.next  = pre;
            pre = next1;
            next1 = nt;
        }
        next.next = pre;
        for (int i = 0; i < len/2; i++) {
            if (head.val!=pre.val) {
                return false;
            }
            head = head.next;
            pre = pre.next;
        }
        return true;
    }
}
