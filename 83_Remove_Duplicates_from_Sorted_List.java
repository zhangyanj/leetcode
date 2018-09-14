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
        ListNode pre = new ListNode(1);
        pre.next = head;
        ListNode pre1 = pre;
        while (true) {
            if (pre1==null||pre1.next==null||pre1.next.next==null) {
                break;
            }
            ListNode temp = pre1;
            while (pre1!=null&&pre1.next!=null&&pre1.next.next!=null&&pre1.next.val == pre1.next.next.val) {
                pre1 = pre1.next;
            }
            temp.next=pre1.next;
            pre1 = pre1.next;
        }
        return pre.next;
    }
}
