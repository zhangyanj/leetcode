/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode ans = new ListNode(1);
        ans.next = head;
        ListNode headt = head;
        ListNode headtemp = head;
        int len = 0;
        while (headt!=null) {
            len++;
            headt = headt.next;
        }
        int ct = len/k;
        ListNode tail = ans;
        for (int i = 0; i < ct; i++) {
            ListNode pre = tail;
            ListNode head1 = tail.next;
            tail = head1;
            for (int j = 0; j < k-1; j++) {
                tail = tail.next;
            }
            tail = main(pre, head1, tail); 
        }
        return ans.next;
    }
    
    public ListNode main(ListNode pr, ListNode from, ListNode to){
        ListNode next = to.next;
        ListNode pre = null;
        ListNode fromtg = from;
        while (from!=next) {
            ListNode nt = from.next;
            from.next = pre;
            pre = from;
            from = nt;
        }
        pr.next = pre;
        fromtg.next = next;
        return fromtg;
    }
}
