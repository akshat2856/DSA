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
    int val = -1;
    int cnttt = 0;
    public int kthSmallest(TreeNode root, int k) {
        if(root==null)return val;
        solve(root,k);
        return val;
    }
    public void solve(TreeNode root,int k){
       if(root==null)return;
       if(root.left!=null) solve(root.left,k);
        cnttt++;
       if(cnttt==k){
            val = root.val;
            return;
        }
       if(root.right!=null)solve(root.right,k);
    }
}