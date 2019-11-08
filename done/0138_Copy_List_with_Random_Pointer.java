/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        if (head == null) {
            return null;
        }
        RandomListNode head1 = head;
        while (head1!=null) {
            RandomListNode temp = new RandomListNode(head1.label);
            temp.next = head1.next;
            head1.next = temp;
            head1 = temp.next;
        }
        RandomListNode head2 = head;
        while (head2!=null) {
            if (head2.random != null) {
                head2.next.random = head2.random.next;
            }
            head2 = head2.next.next;
        }
        RandomListNode res = head;
        RandomListNode res1 = head.next;
        while (res!=null) {
            RandomListNode nt = res.next.next;
            RandomListNode cp = res.next;
            res.next = nt;
            cp.next = nt==null?null:nt.next;
            res = nt;
        }
        return res1;
    }
}
