/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode ans = new ListNode(1);
        ans.next = head;
        ListNode pre = ans;
        ListNode head1 = head;
        while (head1!=null) {
            if (head1.next == null) {
                break;
            }
            while (head1.val==head1.next.val) {
                head1 = head1.next;
                if (head1.next == null) {
                    break;
                }
            }
            if (pre.next == head1) {
                pre = pre.next;
                head1 = head1.next;
                continue;
            }
            pre.next = head1.next;
            head1 = pre.next;
        }
        return ans.next;
    }
}
