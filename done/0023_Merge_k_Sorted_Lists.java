/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        return main(lists, 0, lists.length-1);
    }
    
    public ListNode main(ListNode[] lists, int from, int to) {
        if (from==to) {
            return lists[from];
        }
        if (from+1==to) {
            return mergeTwoLists(lists[from], lists[to]);
        }
        int mid = (from+to)/2;
        return mergeTwoLists(main(lists, from, mid), main(lists, mid+1, to));
    }
    
    
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode node = new ListNode(1);
        ListNode res = node;
        while (l1!=null&&l2!=null) {
            if (l1.val > l2.val) {
                node.next = new ListNode(l2.val);
                l2 = l2.next;
            } else {
                node.next = new ListNode(l1.val);
                l1 = l1.next;
            }
            node = node.next;
        }
        
        while (l1!=null) {
            node.next = new ListNode(l1.val);
            l1 = l1.next;
            node = node.next;
        }
        
        while (l2!=null) {
            node.next = new ListNode(l2.val);
            l2 = l2.next;
            node = node.next;
        }
        return res.next;
    }
    
}
