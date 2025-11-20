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
    public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> list = new ArrayList<>();
    if(root==null)return list;
    Queue<TreeNode> tree = new LinkedList<>();
    tree.add(root);
        while(!tree.isEmpty()){
            int size = tree.size();
            List<Integer> level = new ArrayList<>();
            for(int i=0 ; i<size ; i++){
              TreeNode node = tree.poll();
              level.add(node.val);
              if(node.left!=null){
                tree.add(node.left);
              }
              if(node.right!=null){
                tree.add(node.right);
              }
            }
            list.add(level);
        }
        return list;
    }
    }