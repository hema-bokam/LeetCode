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
    public List<Integer> inorderTraversal(TreeNode root) {
        //Morris Inorder traversal
        List<Integer> res = new ArrayList<>();
        while(root != null){
            if(root.left == null){
                res.add(root.val);
                root = root.right;
            }else{
                TreeNode temp = root.left;
                while(temp.right != null && temp.right != root){
                    temp = temp.right;
                }
                if(temp.right == null){
                    temp.right = root;
                    root = root.left;
                }else{ // temp.right == root
                    temp.right = null;
                    res.add(root.val);
                    root = root.right;
                }
            }
        }
        return res;
    }
}