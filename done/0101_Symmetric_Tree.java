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
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isdui(root.left, root.right);
    }
    public boolean isdui(TreeNode root1, TreeNode root2){
        if (root1==null&&root2==null) {
            return true;
        }
        if (root1==null||root2==null) {
            return false;
        }
        if (root1.val==root2.val&&isdui(root1.left, root2.right)&&isdui(root1.right, root2.left)) {
            return true;
        } else {
            return false;
        }
    }
}
