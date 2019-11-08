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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0) {
            return null;
        }
        TreeNode ans =  main(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
        return ans;
    }
    
    public TreeNode main(int[] preorder, int i, int j, int[] inorder, int i1, int j1){
        if (i > j||i1 > j1) {
            return null;
        }
        TreeNode node = new TreeNode(preorder[i]);
        if (i == j||i1 == j1) {
            return node;
        }
        int index = findNodeIndex(inorder, preorder[i]);
        node.left = main(preorder, i+1, index - i1 + i, inorder, i1, index-1);
        node.right = main(preorder, index - i1 + i + 1, j, inorder, index+1, j1);
        return node;
    }
    
    public int findNodeIndex(int[] nums, int num){
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == num) {
                return i;
            }
        }
        return 0;
    }
}
