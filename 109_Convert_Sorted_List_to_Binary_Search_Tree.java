/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        ListNode head1 = head;
        ListNode head2 = head;
        int len = 0;
        while (head1!=null) {
            head1 = head1.next;
            len++;
        }
        int[] arr = new int[len];
        int index = 0;
        while (head2!=null) {
            arr[index++] = head2.val;
            head2 = head2.next;
        }
        return main(arr, 0, len-1);
    }
    
    public TreeNode main(int[] arr, int from, int to){
        if (from > to) {
            return null;
        }
        int middle = (from+to)/2;
        TreeNode node = new TreeNode(arr[middle]);
        node.left = main(arr, from, middle-1);
        node.right = main(arr, middle+1, to);
        return node;
    }
}
