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
    public void recoverTree(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        inorder(root,ans);
        Collections.sort(ans);
        correct(root,ans,new int[]{0});
        //inorder(root,ans);
    }
    void inorder(TreeNode root,ArrayList<Integer> ans){
        if(root==null)return;
        inorder(root.left,ans);
        ans.add(root.val);
        inorder(root.right,ans);
    }
     void correct(TreeNode root,ArrayList<Integer> ans,int[] i){
        if(root==null)return;
        correct(root.left,ans,i);
        root.val = ans.get(i[0]++);
        correct(root.right,ans,i);
    }
}