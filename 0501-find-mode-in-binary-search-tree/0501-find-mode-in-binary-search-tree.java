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
 //inorder traversal is sorted
class Solution {
    int currNum = 0, maxFreq = 0, currFreq = 0;
    List<Integer> arr = new ArrayList<>();
    public int[] findMode(TreeNode root) {
        inOrder(root);
        return arr.stream().mapToInt(val -> val).toArray();
    }
    public void inOrder(TreeNode root){
        if(root == null) return;
        inOrder(root.left);
        if(root.val == currNum) currFreq++;
        else{
            currNum = root.val;
            currFreq = 1;
        }
        if(currFreq > maxFreq){
            arr = new ArrayList<>();
            arr.add(root.val);
            maxFreq = currFreq;
        }else if(currFreq == maxFreq) arr.add(root.val);
        inOrder(root.right);
    }
}