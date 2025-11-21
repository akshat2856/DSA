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

    static class Pair {
        TreeNode node;
        int index;

        Pair(TreeNode node, int index) {
            this.node = node;
            this.index = index;
        }
    }

    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) return 0;

        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root, 0));

        int maxWidth = 0;

        while (!q.isEmpty()) {
            int size = q.size();
            int minIndex = q.peek().index;  
            int first = 0, last = 0;

            for (int i = 0; i < size; i++) {
                Pair p = q.poll();
                int currIdx = p.index - minIndex;   
                TreeNode node = p.node;

                if (i == 0) first = currIdx;
                if (i == size - 1) last = currIdx;

                if (node.left != null)
                    q.offer(new Pair(node.left, currIdx * 2));

                if (node.right != null)
                    q.offer(new Pair(node.right, currIdx * 2 + 1));
            }

            maxWidth = Math.max(maxWidth, last - first + 1);
        }

        return maxWidth;
    }
}
