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
    TreeNode node1;
    TreeNode node2;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        node1 = p;
        node2 = q;
        if (root == null) {
            return null;
        }
        if (root == p||root == q) {
            return root;
        }
        if (main(root.left)&&main(root.right)) {
            return root;
        }
        if (main(root.left)) {
            return lowestCommonAncestor(root.left, p ,q);
        }
        return lowestCommonAncestor(root.right, p ,q);
    }
    
    public boolean main (TreeNode node) {
        if (node == null) {
            return false;
        }
        if (node == node1||node == node2) {
            return true;
        }
        return main(node.left)||main(node.right);
    }
}
