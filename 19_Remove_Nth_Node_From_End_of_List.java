/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fir = head;
        for (int i = 0; i < n; i++) {
            fir = fir.next;
        }
        if (fir == null) {
            return head.next;
        }
        ListNode sec = head;
        while (fir.next!=null) {
            fir = fir.next;
            sec = sec.next;
        }
        sec.next = sec.next.next;
        return head;
    }
}
