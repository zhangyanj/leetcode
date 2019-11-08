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
    public List<TreeNode> generateTrees(int n) {
        if (n == 0) {
            return new ArrayList<TreeNode>();
        }
        List<TreeNode> ans = main(1, n);
        return ans;
    }
    
    public List<TreeNode> main (int from, int to) {
        List<TreeNode> ans = new ArrayList<TreeNode>();
        if (from > to) {
            ans.add(null);
            return ans;
        }
        for (int i = from; i <= to; i++) {
            List<TreeNode> lefts = main(from, i-1);
            List<TreeNode> rights = main(i+1, to);
            for (TreeNode left:lefts) {
                for (TreeNode right:rights) {
                    TreeNode node = new TreeNode(i);
                    node.left = left;
                    node.right = right;
                    ans.add(node);
                }
            }
        }
        return ans;
    }
}
