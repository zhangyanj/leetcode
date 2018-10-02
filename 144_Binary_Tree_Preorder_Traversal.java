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
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (true) {
            if (root != null) {
                list.add(root.val);
                stack.push(root);
                root = root.left;
            } else {
                if (stack.isEmpty()) {
                    return list;
                }
                root = stack.pop();
                root = root.right;
            }
        }
    }
}
