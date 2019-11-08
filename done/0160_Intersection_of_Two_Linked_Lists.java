/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode headA1 = headA;
        ListNode headB1 = headB;
        while (headA1!=null&&headB1!=null) {
            headA1 = headA1.next;
            headB1 = headB1.next;
        }
        if (headA1 == null) {
            headA1 = headB;
            while (headB1!=null) {
                headA1 = headA1.next;
                headB1 = headB1.next;
            }
            headB1 = headA;
            while (headB1!=null&&headA1!=null&&headB1!=headA1) {
                headA1 = headA1.next;
                headB1 = headB1.next;
            }
            if (headB1==headA1) {
                return headB1;
            } else {
                return null;
            }
        } else if (headB1 == null) {
            headB1 = headA;
            while (headA1!=null) {
                headA1 = headA1.next;
                headB1 = headB1.next;
            }
            headA1 = headB;
            while (headB1!=null&&headA1!=null&&headB1!=headA1) {
                headA1 = headA1.next;
                headB1 = headB1.next;
            }
            if (headB1==headA1) {
                return headB1;
            } else {
                return null;
            }
        } else {
            return null;
        }
    }
}
