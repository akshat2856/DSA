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
    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        inorder(root,ans);
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<ans.size();i++){
            int compliment = k-ans.get(i);
            if(map.containsKey(compliment))return true;
            map.put(ans.get(i),i);
        }
        return false;
    }
    public void inorder(TreeNode root,ArrayList<Integer> ans){
        if(root==null)return;
        inorder(root.left,ans);
        ans.add(root.val);
        inorder(root.right,ans);
    }
}