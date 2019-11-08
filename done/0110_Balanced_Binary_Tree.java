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
    boolean ans = true;
    public boolean isBalanced(TreeNode root) {
        int[] arr = new int[1];
        return main(root, arr);
    }
    public boolean main(TreeNode root, int[] arr){
        if (root == null) {
            arr[0] = 0;
            return true;
        }
        int[] arr1 = new int[1];
        boolean left = main(root.left, arr1);
        int[] arr2 = new int[1];
        boolean right = main(root.right, arr2);
        if (left&&right&&(arr1[0]-arr2[0]<=1&&arr2[0]-arr1[0]<=1)) {
            arr[0] = Math.max(arr1[0], arr2[0])+1;
            return true;
        } else {
            arr[0] = Math.max(arr1[0], arr2[0])+1;
            return false;
        }
    }
}
