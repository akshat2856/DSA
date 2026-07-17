/**
 * Definition for a binary que node.
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
    public int amountOfTime(TreeNode root, int start) {
        ArrayList<TreeNode> parent = new ArrayList<>(1000000);
        for(int i=0;i<=1000000;i++){
            parent.add(null);
        }
        int[] check = new int[1000001];
        markparent(root,parent);
        TreeNode temp = find(root,start);
        Queue<TreeNode> que = new LinkedList<>();
        int count = -1;
        que.add(temp);
        check[temp.val]=1;
         while(!que.isEmpty()){
            count++;
            int size = que.size();
            for(int i=0 ; i<size ; i++){
              TreeNode node = que.poll();
              TreeNode parentnode = parent.get(node.val);
              if(parentnode!=null && check[parentnode.val]==0){
                check[parentnode.val]=1;
                que.offer(parentnode);
              }
              if(node.left!=null && check[node.left.val]==0){
                check[node.left.val]=1;
                que.add(node.left);
              }
              if(node.right!=null && check[node.right.val]==0){
                check[node.right.val]=1;
                que.add(node.right);
              }
            }
         }
            return count;
        }
        public TreeNode find(TreeNode root,int start){
            if(root==null)return null;
            if(root.val==start)return root;
            TreeNode left = find(root.left,start);
            if(left!=null)return left;
            return find(root.right,start);
        }
        public void markparent(TreeNode root,ArrayList<TreeNode> parent){
            if(root==null)return;
            if(root.left!=null){
                parent.set(root.left.val,root);
            }
            if(root.right!=null){
                parent.set(root.right.val,root);
            }
            markparent(root.left,parent);
            markparent(root.right,parent);
        }
    }
