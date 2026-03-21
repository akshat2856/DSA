/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root==null)return list;
        Queue<TreeNode> tree = new LinkedList<>();
        tree.add(root);
        while(!tree.isEmpty()){
            int size = tree.size();
            int level = 0;
            for(int i=0;i<size;i++){
                TreeNode node = tree.poll();
            level = node.val;
                if(node.left!=null)tree.add(node.left);
                if(node.right!=null)tree.add(node.right);
            }
            list.add(level);
        }
        return list;
    }
}