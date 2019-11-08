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
    public TreeNode sortedArrayToBST(int[] nums) {
        return main(nums, 0, nums.length-1);
    }
    
    public TreeNode main(int[] nums, int from, int to){
        if (from>to) {
            return null;
        }
        int middle = (from+to)/2;
        TreeNode node = new TreeNode(nums[middle]);
        if (from == to) {
            return node;
        }
        node.left = main(nums, from, middle-1);
        node.right = main(nums, middle+1, to);
        return node;
        
    }
}
