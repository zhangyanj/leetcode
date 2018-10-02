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
    public int maxDepth(TreeNode root) {
        return main(root);
    }
    public int main(TreeNode root){
        if (root == null) {
            return 0;
        }
        int left = main(root.left);
        int right = main(root.right);
        return Math.max(left, right)+1;
    }
}
