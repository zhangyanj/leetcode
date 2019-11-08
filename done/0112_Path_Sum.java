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
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        return main(root, sum);
    }
    
    public boolean main(TreeNode root, int nowsum) {
        if (root.left == null&&root.right == null&&nowsum==root.val) {
            return true;
        }
        if (root.left == null&&root.right == null) {
            return false;
        }
        if (root.left == null) {
            return main(root.right, nowsum-root.val);
        }
        if (root.right == null) {
            return main(root.left, nowsum-root.val);
        }
        return main(root.left, nowsum-root.val)||main(root.right, nowsum-root.val);
    }
}
