/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {};
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    
    private void Inorder(TreeNode node, List<Integer> result){
    
    if(node == null){
        return;
    }
    
    //step - 1 --> traverse left node
    Inorder(node.left, result);
    
    //step - 2 --> traverse root node
    result.add(node.val);
   
        
    //step - 3 --> traverse right node
    Inorder(node.right, result);
}
    
    
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Inorder(root, result);
        return result;
        
        
    }
}