/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        int len = 0;
        ListNode head1 = head;
        while (head1 != null) {
            len++;
            head1 = head1.next;
        }
        if (len == 0) {
            return head;
        }
        k%=len;
        if (k==0) {
            return head;
        }
        ListNode head2 = head;
        for (int i = 0; i < k; i++) {
            head2 = head2.next;
        }
        ListNode pre = head;
        while (head2.next != null) {
            pre = pre.next;
            head2 = head2.next;
        }
        ListNode ans = pre.next;
        pre.next = null;
        ListNode anstemp = ans;
        while (anstemp.next != null) {
            anstemp = anstemp.next;
        }
        anstemp.next = head;
        return ans;
    }
}
