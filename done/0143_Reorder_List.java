/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        if (head == null) {
            return;
        }
        ListNode head1 = head;
        ListNode head2 = head;
        int len = 0;
        while (head1!=null) {
            len++;
            head1 = head1.next;
        }
        for (int i = 0; i < len/2-1; i++) {
            head2 = head2.next;
        }
        ListNode ano = head2.next;
        head2.next = null;
        ano = revert(ano);
        ListNode head3 = head;
        ListNode nt = head3;
        while (head3!=null&&ano!=null) {
            nt = head3.next;
            ListNode anont = ano.next;
            head3.next = ano;
            if (nt!=null) {
                ano.next = nt;   
            }
            head3 = nt;
            ano = anont;
        }
    }
    public ListNode revert(ListNode head) {
        ListNode pre = null;
        while (head!=null) {
            ListNode nt = head.next;
            head.next = pre;
            pre = head;
            head = nt;
        }
        return pre;
    }
}
