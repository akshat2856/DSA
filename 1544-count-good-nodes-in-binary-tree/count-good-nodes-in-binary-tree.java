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
    int count =0;
    //int maxvalue;
    public int goodNodes(TreeNode root) {
        if(root==null)return count;
        //maxvalue = root.val;
        find(root,root.val);
        return count;
    }
    public void find(TreeNode root,int maxvalue){
        if(root==null)return;
        maxvalue = Math.max(root.val,maxvalue);
        if(root.val==maxvalue)count++;
        find(root.left,maxvalue);
        find(root.right,maxvalue);
    }
}