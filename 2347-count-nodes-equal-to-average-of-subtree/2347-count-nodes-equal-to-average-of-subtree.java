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
    class Pair{
        int sum;
        int nodes;
        public Pair(int sum, int nodes){
            this.sum = sum;
            this.nodes = nodes;
        }
    }
    int count=0;
    public int averageOfSubtree(TreeNode root) {
        preOrderTraversal(root);
        return count;
    }
    public Pair preOrderTraversal(TreeNode root){
        if(root == null) return null;
        Pair left = preOrderTraversal(root.left);
        Pair right = preOrderTraversal(root.right);
        int sum = root.val, totalNodes = 1;
        if(left != null){
            sum += left.sum;
            totalNodes += left.nodes;
        }
        if(right != null){
            sum += right.sum;
            totalNodes += right.nodes;
        }
        if(sum/totalNodes == root.val) count++;
        return new Pair(sum, totalNodes);
    }
}