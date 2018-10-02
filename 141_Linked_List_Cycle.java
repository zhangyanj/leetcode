/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode h1 = head;
        ListNode h2 = head;
        if (h1==null||h1.next==null||h2==null||h2.next==null) {
            return false;
        }
        while (true) {
            h1 = h1.next;
            h2 = h2.next.next;
            if (h1==null||h1.next==null||h2==null||h2.next==null) {
                return false;
            }
            if (h1==h2) {
                return true;
            }
        }
    }
}
