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
        ArrayDeque<TreeNode> q = new ArrayDeque<>();
        List<List<Integer>> answer = new ArrayList<>();
        if(root==null)return new ArrayList<>();
        q.add(root);
        int i = 0;
        while(!q.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int size = q.size();
            if(i%2==0){
                for(int j=0;j<size;j++){
                    TreeNode temp = q.poll();
                    int val = temp.val;
                    list.add(val);
                    if(temp.left!=null)q.add(temp.left);
                    if(temp.right!=null)q.add(temp.right);
                }
            }
            else{
                for(int j=0;j<size;j++){
                    TreeNode temp = q.pollLast();
                    int val = temp.val;
                    list.add(val);
                    if(temp.right!=null)q.addFirst(temp.right);
                    if(temp.left!=null)q.addFirst(temp.left);
                }
            }
            i++;
            answer.add(list);
        }
        return answer;
    }
}