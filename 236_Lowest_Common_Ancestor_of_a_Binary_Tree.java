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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        if (root == p||root == q) {
            return root;
        }
        if (main(root.left, p, q)&&main(root.right, q, p)) {
            return root;
        }
        if (main(root.left, p, q)) {
            return lowestCommonAncestor(root.left, p, q);
        }
        return lowestCommonAncestor(root.right, p, q);
    }
    public boolean main (TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return false;
        }
        if (root == p||root == q) {
            return true;
        }
        return main(root.left, p, q)||main(root.right, p, q);
    }
}
