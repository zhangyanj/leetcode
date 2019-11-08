/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head==null||head.next==null) {
            return head;
        }
        ListNode res = new ListNode(1);
        res.next = head;
        ListNode pre = res;
        ListNode fir = head;
        ListNode sec = head.next;
        while (true) {
            ListNode nt = sec.next;
            pre.next = sec;
            sec.next = fir;
            fir.next = nt;
            pre = fir;
            fir = nt;
            if (fir == null||fir.next==null) {
                break;
            }
            sec = fir.next;
        }
        return res.next;
    }
}
