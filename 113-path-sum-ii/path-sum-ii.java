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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        dfs(root,arr,ans,targetSum);
        return ans;
    }
    private void dfs(TreeNode root,List<Integer> arr,List<List<Integer>> ans,int Sum){
        if(root==null)return;
        arr.add(root.val);
        if(root.left==null && root.right==null && Sum==root.val){
            ans.add(new ArrayList<>(arr));
        }
        dfs(root.left,arr,ans,Sum-root.val);
        dfs(root.right,arr,ans,Sum-root.val);
        arr.remove(arr.size()-1);
    }
}