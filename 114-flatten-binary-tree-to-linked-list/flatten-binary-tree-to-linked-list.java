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

 //brute force
// class Solution {
//     public void flatten(TreeNode root) {
//         if (root == null) return;

        
//         List<Integer> li = new ArrayList<>();
//         solve(root, li);

       
//         TreeNode curr = root;
//         curr.left = null;
//         for (int i = 1; i < li.size(); i++) {
//             curr.right = new TreeNode(li.get(i));
//             curr = curr.right;
//         }
//     }

//     public static void solve(TreeNode root, List<Integer> li) {
//         if (root == null) return;
//         li.add(root.val);
//         solve(root.left, li);
//         solve(root.right, li);
//     }
// }

//optimal with O(1) sapce
class Solution {
    public void flatten(TreeNode root) {
        TreeNode cur = root;
        while (cur != null) {
            if (cur.left != null) {
                TreeNode prev = cur.left;
                while (prev.right != null) {
                    prev = prev.right;
                }
                prev.right = cur.right;
                cur.right = cur.left;
                cur.left = null;
            }
            cur = cur.right;
        }
    }
}
