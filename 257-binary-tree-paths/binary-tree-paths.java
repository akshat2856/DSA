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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> resulte = new ArrayList<>();
        if(root==null) return resulte;
        dfs(root,"",resulte);
        return resulte;
    }
    public void dfs(TreeNode root,String path,List<String> resulte){
        if(root==null)return;
        if(root.left==null && root.right==null){
            resulte.add(path + root.val);
            return;
        }
        dfs(root.left,path + root.val + "->",resulte);
        dfs(root.right,path + root.val + "->",resulte);
    }
}