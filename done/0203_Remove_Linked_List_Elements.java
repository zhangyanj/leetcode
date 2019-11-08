/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode pre = new ListNode(1);
        pre.next = head;
        ListNode head1 = pre;
        while (true) {
            while (head1.next!=null&&head1.next.val!=val) {
                head1 = head1.next;
            }
            if (head1.next==null) {
                break;
            }
            head1.next = head1.next.next;
        }
        return pre.next;
    }
}
