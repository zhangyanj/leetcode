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
    ArrayList<String> list;
    public List<String> binaryTreePaths(TreeNode root) {
        list = new ArrayList<String>();
        if (root == null) {
            return list;
        }
        if (root.left == null&&root.right == null) {
            String temp = "" + root.val;
            list.add(temp);
            return list;
        }
        main(root, "", true);
        return list;
    }
    
    public void main (TreeNode root, String temp, boolean flag) {
        if (flag) {
            temp = root.val + "";
        } else {
            temp = temp + "->" + root.val;
        }
        if (root.left == null&&root.right == null) {
            list.add(temp);
            return;
        }
        if (root.left != null) main(root.left, temp, false);
        if (root.right != null) main(root.right, temp, false);
    }
}
