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
    static boolean flag;
    public boolean isBalanced(TreeNode root) {
        if(root==null)return true;
        flag = true;
        height(root);
        return flag;
        // int heightleft = height(root.left);
        // int heightright = height(root.right);
        // if(Math.abs(heightleft-heightright)>1)return false;
        // return isBalanced(root.left) && isBalanced(root.right);
    }
    public int height(TreeNode node){
        if(node==null)return 0;
        int leftheight = height(node.left);
        int rightheight = height(node.right);
        if(Math.abs(leftheight-rightheight)>1)flag = false;
        return 1 + Math.max(leftheight,rightheight);
    }
}