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
    ArrayList<ArrayList<String>> ans;
    int[] map = {};
    public int sumNumbers(TreeNode root) {
        int[] data = new int[2];
        dfs(data, root);
        return data[1];
    }
    
    
    public void dfs (int[] data, TreeNode root) {
        if (root == null) {
            return;
        }
        data[0] = data[0]*10+root.val;
        if (root.left==null&&root.right==null) data[1]+=data[0];
        dfs(data, root.left);
        dfs(data, root.right);
        data[0]/=10;
    }
}
