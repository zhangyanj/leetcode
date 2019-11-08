/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        if (root==null) {
            return;
        }
        if (root.left==null) {
            return;
        }
        ArrayList<TreeLinkNode> leftlist = findright(root.left);
        ArrayList<TreeLinkNode> rightlist = findleft(root.right);
        for (int i = 0; i < leftlist.size(); i++) {
            leftlist.get(i).next = rightlist.get(i);
        }
        connect(root.left);
        connect(root.right);
    }
    
    public ArrayList<TreeLinkNode> findleft(TreeLinkNode root) {
        ArrayList<TreeLinkNode> list = new ArrayList<TreeLinkNode>();
        TreeLinkNode tp = root;
        list.add(tp);
        while (tp.left != null) {
            tp=tp.left;
            list.add(tp);
        }
        return list;
    }
    
    public ArrayList<TreeLinkNode> findright(TreeLinkNode root) {
        ArrayList<TreeLinkNode> list = new ArrayList<TreeLinkNode>();
        TreeLinkNode tp = root;
        list.add(tp);
        while (tp.right != null) {
            tp=tp.right;
            list.add(tp);
        }
        return list;
    }
}
