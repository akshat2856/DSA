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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        Deque<TreeNode> dq = new LinkedList<>();
        dq.add(root);
        boolean leftToRight = true;
        while (!dq.isEmpty()) {
            int size = dq.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                if (leftToRight) {
                    TreeNode node = dq.pollFirst();
                    level.add(node.val);
                    if (node.left != null) dq.addLast(node.left);
                    if (node.right != null) dq.addLast(node.right);
                } 
                else {
                    TreeNode node = dq.pollLast();
                    level.add(node.val);
                    if (node.right != null) dq.addFirst(node.right);
                    if (node.left != null) dq.addFirst(node.left);
                }
            }
            res.add(level);
            leftToRight = !leftToRight; 
        }
        return res;
    }
}