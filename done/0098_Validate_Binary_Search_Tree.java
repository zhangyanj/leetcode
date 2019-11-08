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
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        long[] qq = new long[2];
        return main(root, qq);
    }
    
    public boolean main(TreeNode root, long[] qq){
        long[] qq1 = new long[2];
        boolean resq2;
        boolean resq1;
        if (root.left == null) {
            resq1 = true;
            qq1[0] = -21474836471L;
            qq1[1] = -21474836471L;
            qq[0] = root.val;
        } else {
            resq1 = main(root.left, qq1);
            qq[0] = qq1[0];
        }
        long[] qq2 = new long[2];
        if (root.right == null) {
            resq2 = true;
            qq2[0] = 21474836471L;
            qq2[1] = 21474836471L;
            qq[1] = root.val;
        } else {
            resq2 = main(root.right, qq2);
            qq[1] = qq2[1];
        }
        if(resq1&&resq2&&root.val>qq1[1]&&root.val<qq2[0]){
            return true;
        } else {
            return false;
        }
    }
}
