/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(0);
        ListNode tempans = ans;
        int jin = 0;
        while (l1 != null && l2 != null) {
            tempans.next = new ListNode((l1.val+l2.val+jin)%10);
            jin = (l1.val+l2.val+jin)/10;
            tempans = tempans.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null) {
            tempans.next = new ListNode((l1.val+jin)%10);
            jin = (l1.val+jin)/10;
            tempans = tempans.next;
            l1 = l1.next;
        }
        while (l2 != null) {
            tempans.next = new ListNode((l2.val+jin)%10);
            jin = (l2.val+jin)/10;
            tempans = tempans.next;
            l2 = l2.next;
        }
        if (jin == 1) {
            tempans.next = new ListNode(1);
        }
        return ans.next;
    }
}
