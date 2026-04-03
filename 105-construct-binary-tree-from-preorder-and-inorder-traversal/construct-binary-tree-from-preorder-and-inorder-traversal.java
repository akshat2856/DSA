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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
       int n = preorder.length;
       return build(0,n-1,0,n-1,preorder,inorder); 
    }
    public TreeNode build(int preLi,int preHi,int inLi,int inHi,int[] preorder,int[] inorder){
        if(preLi>preHi)return null;
        int val = preorder[preLi];
        TreeNode root = new TreeNode(val);
        int r = -1;
        for(int i=inLi;i<=inHi;i++){
            if(inorder[i]==val){
                r=i;
                break;
            }
        }
        int cnt = r-inLi;
        root.left = build(preLi+1,preLi+cnt,inLi,r-1,preorder,inorder);
        root.right = build(preLi+cnt+1,preHi,r+1,inHi,preorder,inorder);
        return root;
    }
}

