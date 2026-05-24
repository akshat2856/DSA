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
        if(root==null)return "";
        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        while(!que.isEmpty()){
            TreeNode curr = que.poll();
            if(curr==null){sb.append("N ");
            continue;
        }
        sb.append(curr.val).append(" ");
        que.add(curr.left);
        que.add(curr.right);
        }
        return sb.toString();
}
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.length()==0)return null;
        String[] arr = data.split(" ");
        Queue<TreeNode> que = new LinkedList<>();
        TreeNode root = new TreeNode(Integer.parseInt(arr[0]));
        int i=1;
        que.add(root);
        while(!que.isEmpty()){
            TreeNode curr = que.poll();
            if(!arr[i].equals("N")){
                curr.left = new TreeNode(Integer.parseInt(arr[i]));
                que.add(curr.left);
            }
            i++;
            if(!arr[i].equals("N")){
                curr.right = new TreeNode(Integer.parseInt(arr[i]));
                que.add(curr.right);
            }
            i++;
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));