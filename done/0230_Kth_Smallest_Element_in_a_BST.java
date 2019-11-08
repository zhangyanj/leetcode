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
    public int kthSmallest(TreeNode root, int k) {
        while (root!=null) {
            int leftcount = getdeep(root.left);
            if (leftcount == k-1) {
                return root.val;
            }
            if (leftcount < k-1) {
                k = k-leftcount-1;
                root = root.right;
            } else {
                root = root.left;
            }
        }
        return 1;
    }
    public int getdeep(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return getdeep(root.left) + getdeep(root.right) + 1;
    }
}
