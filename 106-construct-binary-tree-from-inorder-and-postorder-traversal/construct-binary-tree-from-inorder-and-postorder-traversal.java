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

    public TreeNode buildTree(int[] inOrder, int[] postOrder) {

        
        Map<Integer, Integer> inIndexMap = new HashMap<>();
        for (int i = 0; i < inOrder.length; i++) {
            inIndexMap.put(inOrder[i], i);
        }

      
        return build(inOrder, postOrder, inIndexMap,
                     postOrder.length - 1,   
                     0,                      
                     inOrder.length - 1);     
    }

    private TreeNode build(int[] inOrder, int[] postOrder,
                           Map<Integer, Integer> inIndexMap,
                           int rootIndex,
                           int left, int right) {

       
        TreeNode root = new TreeNode(postOrder[rootIndex]);

       
        int mid = inIndexMap.get(postOrder[rootIndex]);

        int rightSize = right - mid; 

       
        if (mid < right) {
            root.right = build(inOrder, postOrder, inIndexMap,
                               rootIndex - 1,   
                               mid + 1,
                               right);
        }

       
        if (mid > left) {
            root.left = build(inOrder, postOrder, inIndexMap,
                              rootIndex - rightSize - 1,
                              left,
                              mid - 1);
        }

        return root;
    }
}
