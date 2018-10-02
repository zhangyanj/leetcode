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
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        getmax(root);
        return max;
    }
    
 
    public int getmax(TreeNode root) {//返回左右子树的最大路径（一个方向的）的值
        if (root == null) {
            return 0;
        }
        int left = getmax(root.left);
        int right = getmax(root.right);
        int level = Math.max(left, right);
        max = Math.max(max, level+root.val);
        max = Math.max(max, left+right+root.val);
        if (level<0) {
            return root.val>0?root.val:0;
        } else {
            return level+root.val>0?level+root.val:0;
        }   
    }
    
}
