/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode node1 = new ListNode(1);
        ListNode node1tp = node1;
        ListNode node2 = new ListNode(1);
        ListNode node2tp = node2;
        ListNode head1 = head;
        while (head1!=null) {
            if (head1.val<x) {
                node1.next = new ListNode(head1.val);
                node1 = node1.next;
            } else {
                node2.next = new ListNode(head1.val);
                node2 = node2.next;
            }
            head1 = head1.next;
        }
        node1.next = node2tp.next;
        return node1tp.next;
        
    }
}
