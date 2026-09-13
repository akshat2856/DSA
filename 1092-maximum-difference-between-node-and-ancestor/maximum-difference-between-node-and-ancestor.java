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
    int maxi = Integer.MIN_VALUE;
    public int maxAncestorDiff(TreeNode root) {
        if(root==null)return 0;
        findmax(root,root.val);
        maxAncestorDiff(root.left);
        maxAncestorDiff(root.right);
        return maxi;
    }
    public void findmax(TreeNode root,int i){
        if(root==null)return;
        maxi=Math.max(Math.abs(root.val-i),maxi);
        findmax(root.left,i);
        findmax(root.right,i);
    }
}