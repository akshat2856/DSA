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
    static class Tuple {
        TreeNode node;
        int x, y;
        Tuple(TreeNode n, int row, int col) {
            node = n;
            x = row;
            y = col;
        }
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {

        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        Queue<Tuple> q = new LinkedList<>();

        q.offer(new Tuple(root, 0, 0));

        while (!q.isEmpty()) {
            Tuple t = q.poll();
            TreeNode node = t.node;
            int x = t.x, y = t.y;

            map.computeIfAbsent(x, k -> new TreeMap<>());
            map.get(x).computeIfAbsent(y, k -> new PriorityQueue<>());

            map.get(x).get(y).offer(node.val);

            if (node.left != null)
                q.offer(new Tuple(node.left, x - 1, y + 1));

            if (node.right != null)
                q.offer(new Tuple(node.right, x + 1, y + 1));
        }

        List<List<Integer>> ans = new ArrayList<>();

        for (TreeMap<Integer, PriorityQueue<Integer>> ys : map.values()) {
            List<Integer> col = new ArrayList<>();

            for (PriorityQueue<Integer> pq : ys.values()) {
                while (!pq.isEmpty())
                    col.add(pq.poll());
            }

            ans.add(col);
        }

        return ans;
    }
}
