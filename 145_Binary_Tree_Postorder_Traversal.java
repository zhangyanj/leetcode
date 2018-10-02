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
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        TreeNode cru = root;
        TreeNode pre = null;
        while (!stack.isEmpty()||cru!=null) {
            while (cru!=null) {
                stack.push(cru);
                cru = cru.left;
            }
            TreeNode top = stack.peek();
            if (top.right == null||top.right == pre) {
                list.add(top.val);
                pre = top;
                stack.pop();
                cru = null;
            } else {
                cru = top.right;
            }
        }
        return list;
    }
}
