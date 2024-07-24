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
    
    private void Preorder(TreeNode node, List<Integer> result){
    
    if(node == null){
        return;
    }
    
    //step - 1 --> traverse root node
    result.add(node.val);
    
    //step - 2 --> traverse left node
    Preorder(node.left, result);
    
    //step - 3 --> traverse right node
    Preorder(node.right, result);
}
    
    
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Preorder(root, result);
        return result;
        
        
    }
}