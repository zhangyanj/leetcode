/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        TreeLinkNode temp = new TreeLinkNode(0);
        TreeLinkNode tp = temp;
        while (root != null) {
            if (root.left != null) {
                tp.next = root.left;
                tp = tp.next;
            }
            if (root.right != null) {
                tp.next = root.right;
                tp = tp.next;
            }
            root = root.next;
            if (root == null) {
                root = temp.next;
                temp.next = null;
                tp = temp;
            }
        }
    }
}
