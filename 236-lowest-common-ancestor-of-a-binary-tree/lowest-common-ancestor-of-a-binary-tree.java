/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null || p==root || q==root)return root;
        boolean pLiesInLeft = exist(root.left,p);
        boolean qLiesInLeft = exist(root.left,q);
        if(pLiesInLeft && qLiesInLeft) return lowestCommonAncestor(root.left,p,q);
        if(!pLiesInLeft && !qLiesInLeft) return lowestCommonAncestor(root.right,p,q);
        else return root;
    }
    public boolean exist(TreeNode root,TreeNode node){
        if(root==null)return false;
        if(root==node)return true;
        return exist(root.left,node) || exist(root.right,node);
    }
}