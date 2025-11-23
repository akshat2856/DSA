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
    int answer = -1;
    int count = 0;
    public int kthSmallest(TreeNode root, int k) {
        // List<Integer> list = new ArrayList<>();
        // inorder(root, list);
        // return list.get(k - 1);

        inorder(root, k);
        return answer;
    }

    // public void solve(TreeNode root, List<Integer> li) {
    //     if (root == null) return;
        
    //     solve(root.left, li);   
    //     li.add(root.val);                
    //     solve(root.right, li);       
    // }

     private void inorder(TreeNode root, int k) {
        if(root == null) return;

        inorder(root.left, k);

        count++;
        if(count == k) {
            answer = root.val;
            return;
        }

        inorder(root.right, k);
    }

}