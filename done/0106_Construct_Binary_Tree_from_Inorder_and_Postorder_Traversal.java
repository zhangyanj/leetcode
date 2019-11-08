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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        TreeNode ans = main(inorder, 0, inorder.length - 1, postorder,0 , postorder.length - 1);
        return ans;
    }
    
    public TreeNode main(int[] inorder, int i, int j, int[] postorder, int i1, int j1){
        if (i > j||i1 > j1) {
            return null;
        }
        TreeNode node = new TreeNode(postorder[j1]);
        if (i == j||i1 == j1) {
            return node;
        }
        int index = find(inorder, postorder[j1]);
        node.left = main(inorder, i, index - 1, postorder, i1, index -i + i1 -1);
        node.right = main(inorder, index + 1, j, postorder, index -i + i1, j1 - 1);
        return node;
    }
    public int find(int[] nums, int target){
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return 0;
    }
}
