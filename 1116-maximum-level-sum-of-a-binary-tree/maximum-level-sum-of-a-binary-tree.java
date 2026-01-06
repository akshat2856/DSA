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
    public int maxLevelSum(TreeNode root) {
      if(root==null)return -1;
      Queue<TreeNode> tree = new LinkedList<>();
      tree.add(root);
      int ans = 1;
      int x = 0;
      int max = Integer.MIN_VALUE;
      while(!tree.isEmpty()){
        x++;
    int size = tree.size();
    int sum = 0;
    for(int i = 0 ; i<size ; i++){
        TreeNode node = tree.poll();
        sum+=node.val;
        if(node.left!=null)tree.add(node.left);
        if(node.right!=null)tree.add(node.right);
    }
if(sum>max){
    max = sum;
    ans = x;
}
      }  
      return ans;
    }
}