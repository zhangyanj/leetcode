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
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return main(root);
    }
    
    public int main(TreeNode root) {
        if (root.left == null&&root.right==null) {
            return 1;
        }
        int left = Integer.MAX_VALUE;
        int right = Integer.MAX_VALUE;
        if (root.left!=null) {
            left = main(root.left);
        }
        if (root.right!=null) {
            right = main(root.right);
        }
        return Math.min(left, right)+1;
    }
}
