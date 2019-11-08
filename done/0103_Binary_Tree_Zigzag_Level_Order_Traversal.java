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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Stack<TreeNode> stack1 = new Stack<TreeNode>();
        Stack<TreeNode> stack2 = new Stack<TreeNode>();
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if (root == null) return ans;
        stack1.push(root);
        while (!stack1.isEmpty()||!stack2.isEmpty()) {
            List<Integer> temp = new ArrayList<Integer>();
            while (!stack1.isEmpty()) {
                TreeNode node = stack1.pop();
                temp.add(node.val);
                if (node.left!=null) stack2.push(node.left);
                if (node.right!=null) stack2.push(node.right);
            }
            if (temp.size() > 0) ans.add(temp);
            temp = new ArrayList<Integer>();
            while (!stack2.isEmpty()) {
                TreeNode node = stack2.pop();
                temp.add(node.val);
                if (node.right!=null) stack1.push(node.right);
                if (node.left!=null) stack1.push(node.left);
            }
            if (temp.size() > 0) ans.add(temp);
        }
        return ans;
    }
}
