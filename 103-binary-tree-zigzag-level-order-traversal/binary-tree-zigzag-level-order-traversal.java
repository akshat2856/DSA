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
        List<List<Integer>> list = new ArrayList<>();
        if(root==null)return new ArrayList<>();
        Deque<TreeNode> que = new ArrayDeque<>();
        que.add(root);
        int traverse = 0;
        while(!que.isEmpty()){
            int size = que.size();
            List<Integer> li = new ArrayList<>();
            if(traverse%2==0){
                for(int i=0;i<size;i++){
                    TreeNode temp = que.pollFirst();
                    li.add(temp.val);
                    if(temp.left!=null)que.add(temp.left);
                    if(temp.right!=null)que.add(temp.right);
                }
            }
                else{
                    for(int i=0;i<size;i++){
                        TreeNode temp = que.pollLast();
                        li.add(temp.val);
                        if(temp.right!=null)que.addFirst(temp.right);
                        if(temp.left!=null)que.addFirst(temp.left);
                    }
                }
                list.add(li);
                traverse++;
            }
        return list;
    }
}