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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        ArrayList<ArrayList<TreeNode>> ans = new ArrayList<ArrayList<TreeNode>>();
        List<List<Integer>> ans1 = new ArrayList<List<Integer>>();
        if (root==null) {
            return ans1;
        }
        ArrayList<TreeNode> tp = new ArrayList<TreeNode>();
        tp.add(root);
        ans.add(tp);
        while (ans.get(ans.size()-1).size() > 0) {
            tp = new ArrayList<TreeNode>();
            for (TreeNode node:ans.get(ans.size()-1)) {
                if (node.left!=null) {
                    tp.add(node.left);
                }
                if (node.right!=null) {
                    tp.add(node.right);
                }
            }
            ans.add(tp);
        }
        ArrayList<Integer> tp1;
        for (ArrayList<TreeNode> i:ans) {
            tp1 = new ArrayList<Integer>();
            for (TreeNode nd:i) {
                tp1.add(nd.val);
            }
            ans1.add(tp1);
        }
        ans1.remove(ans1.size()-1);
        List<List<Integer>> ans2 = new ArrayList<List<Integer>>();
        for (int i = 0; i < ans1.size(); i++) {
            ans2.add(ans1.get(ans1.size()-1-i));
        }
        return ans2;
    }
}
