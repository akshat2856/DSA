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
    public boolean isSymmetric(TreeNode root) {
       if(root==null)return true;
       Queue<TreeNode> lefttree = new LinkedList<>();
       Queue<TreeNode> righttree = new LinkedList<>();
       lefttree.add(root.left);
       righttree.add(root.right);
       while(!lefttree.isEmpty() && !righttree.isEmpty()){
        TreeNode leftNode = lefttree.poll();
        TreeNode rightNode = righttree.poll();
        if(leftNode==null && rightNode==null)continue;
        if(leftNode==null || rightNode==null)return false;
        if(leftNode.val!=rightNode.val)return false;
        lefttree.add(leftNode.left);
        lefttree.add(leftNode.right);
        righttree.add(rightNode.right);
         righttree.add(rightNode.left);
       } 
       return true;
    }
}