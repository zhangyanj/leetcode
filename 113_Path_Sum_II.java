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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        ArrayList<List<Integer>> list = new ArrayList<List<Integer>>();
        ArrayList<Integer> listtemp = new ArrayList<Integer>();
        if (root == null) {
            return list;
        }
        main(root, sum, listtemp, list);
        return list;
    }
    
    public void main(TreeNode root, int sum, List<Integer> listtemp, List<List<Integer>> list) {
        if (root.left==null&&root.right==null&&root.val==sum) {
            listtemp.add(root.val);
            list.add(new ArrayList<Integer>(listtemp));
            listtemp.remove(listtemp.size() - 1);
            return;
        }
        if (root.left==null&&root.right==null) {
            return;
        }
        if (root.right != null) {
            listtemp.add(root.val);
            main(root.right, sum-root.val, listtemp, list);
            listtemp.remove(listtemp.size() - 1);
        }
        if (root.left != null) {
            listtemp.add(root.val);
            main(root.left, sum-root.val, listtemp, list);
            listtemp.remove(listtemp.size() - 1);
        }
    }
    
}
