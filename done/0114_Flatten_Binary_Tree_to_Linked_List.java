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
    public void flatten(TreeNode root) {
        TreeNode ans = root;
        main(ans);
    }
    public TreeNode main(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode l = root.left;
        TreeNode r = root.right;
        TreeNode tp = main(l);
        root.left = null;
        
        if (tp == null) {
            main(r);
            root.right = r;
        } else {
            root.right = l;
            main(r);
            tp.right = r;
        }
        TreeNode root1 = root;
        while (root1.right!=null) {
            root1 = root1.right;
        }
        return root1;
    }
}
