/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        Queue<TreeNode> que = new LinkedList<TreeNode>();
        Queue<TreeNode> que1 = new LinkedList<TreeNode>();
        que.add(root);
        String ans = "";
        while (!que.isEmpty()||!que1.isEmpty()) {
            while (!que.isEmpty()&&que.peek()==null) {
                ans = ans + ",null";
                que.remove();
            }
            if (que.isEmpty()) {
                que = que1;
                que1 = new LinkedList<TreeNode>();
            } else {
                TreeNode temp = que.remove();
                ans = ans + "," + temp.val;
                que1.add(temp.left);   
                que1.add(temp.right);
            }
        }
        return "[" + ans.substring(1)+"]";
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        System.out.println(data);
        data = data.substring(1, data.length() - 1);
        System.out.println(data);
        Queue<TreeNode> que = new LinkedList<TreeNode>();
        Queue<TreeNode> que1 = new LinkedList<TreeNode>();
        String[] arr=data.split(",");
        if (arr.length == 0) {
            return null;
        }
        String rootval = arr[0];
        if (rootval.equals("null")) {
            return null;
        }
        TreeNode node = new TreeNode(Integer.parseInt(rootval));
        que.add(node);
        int index = 1;
        while (!que.isEmpty()||!que1.isEmpty()) {
            while (!que.isEmpty()&&que.peek()==null) {
                que.remove();
            }
            if (que.isEmpty()) {
                que = que1;
                que1 = new LinkedList<TreeNode>();
            } else {
                TreeNode temp = que.remove();
                if (arr[index].equals("null")) {
                    temp.left = null;
                    que1.add(null); 
                } else {
                    TreeNode left = new TreeNode(Integer.parseInt(arr[index]));
                    temp.left = left;
                    que1.add(left); 
                }
                index++;

                if (arr[index].equals("null")) {
                    temp.right = null;
                    que1.add(null); 
                } else {
                    TreeNode right = new TreeNode(Integer.parseInt(arr[index]));
                    temp.right = right;
                    que1.add(right); 
                }
                index++;
            }
        }
        return node;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));
