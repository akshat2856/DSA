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
// class Solution {
//     public boolean isValidBST(TreeNode root) {
//        List<Integer> li = new ArrayList<>();
//         solve(root, li);
//         for(int i =1;i<li.size();i++){
//             if(li.get(i)<=li.get(i-1))return false;
//         }
//         return true;
//     }

//     public void solve(TreeNode root, List<Integer> li) {
//         if (root == null) return;
        
//         solve(root.left, li);   
//         li.add(root.val);                
//         solve(root.right, li);       
//     }
// }

class Solution {
    public boolean isValidBST(TreeNode root) {
        return findIfBST (root,Long.MAX_VALUE,Long.MIN_VALUE);
    }

    public boolean findIfBST (TreeNode root,long max,long min) {
        if(root == null)
        return true;

        if(root.val >= max || root.val <=min)
        return false;

        return findIfBST(root.left,root.val,min) && findIfBST (root.right,max,root.val) ;
    }
}