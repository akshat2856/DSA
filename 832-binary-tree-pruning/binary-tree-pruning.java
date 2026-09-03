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
    public TreeNode pruneTree(TreeNode root) {
        if(!isone(root))return null;
        remove(root);
        return root;
    }
    public void remove(TreeNode root){
        if(root==null)return;
        if(!isone(root.left))root.left = null;
        else remove(root.left);
        if(!isone(root.right))root.right = null;
        else remove(root.right);
    }
    public boolean isone(TreeNode root){
        if(root==null)return false;
        if(root.val==1)return true;
        return isone(root.left)||isone(root.right);
    }
}