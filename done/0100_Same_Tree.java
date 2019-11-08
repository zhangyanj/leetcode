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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return main(p, q);
    }
    public boolean main (TreeNode p, TreeNode q) {
        if (p==null&&q==null) {
            return true;
        }
        if (p==null||q==null) {
            return false;
        }
        if (p.val==q.val&&isSameTree(p.left, q.left)&&isSameTree(p.right, q.right)) {
            return true;
        } else {
            return false;
        }
    }
}
