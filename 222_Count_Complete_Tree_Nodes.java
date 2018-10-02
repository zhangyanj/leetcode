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
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int ldeep = getdeepl(root);
        int rdeep = getdeepr(root);
        // System.out.println(ldeep);
        // System.out.println(rdeep);
        // return 1;
        if (ldeep == rdeep) {
            return (int)Math.pow(2, ldeep)-1;
        }
        return countNodes(root.left)+countNodes(root.right)+1;
    }
    public int getdeepl(TreeNode root) {
        int ans = 0;
        while (root != null) {
            ans++;
            root = root.left;
        }
        return ans;
    }
    
    public int getdeepr(TreeNode root) {
        int ans = 0;
        while (root != null) {
            ans++;
            root = root.right;
        }
        return ans;
    }
}
