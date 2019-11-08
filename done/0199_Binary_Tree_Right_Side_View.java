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
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (root == null) {
            return list;
        }
        Queue<TreeNode> que = new LinkedList<TreeNode>();
        Queue<TreeNode> que1 = new LinkedList<TreeNode>();
        list.add(root.val);
        que.add(root);
        TreeNode pre = root;
        while (!que.isEmpty()||!que1.isEmpty()) {
            if (que.isEmpty()) {
                que = que1;
                que1 = new LinkedList<TreeNode>();
            }
            TreeNode node = que.remove();
            if (node.left != null) que1.add(node.left);
            if (node.right != null) que1.add(node.right);
            if (que.isEmpty()) {
                list.add(node.val);
            }
        }
        list.remove(0);
        return list;
    }
}
