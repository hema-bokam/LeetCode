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
    HashMap<Integer, Integer> map = new HashMap<>();
    int maxFreq = 0;
    public int[] findMode(TreeNode root) {
        fillMap(root);
        List<Integer> arr = new ArrayList<>();
        for(Integer key : map.keySet()){
            if(map.get(key) == maxFreq){
                arr.add(key);
            }
        }
        return arr.stream().mapToInt(val -> val).toArray();
    }
    public void fillMap(TreeNode root){
        if(root == null) return;
        map.put(root.val, map.getOrDefault(root.val, 0)+1);
        maxFreq = Math.max(maxFreq, map.get(root.val));
        fillMap(root.left);
        fillMap(root.right);
        return;
    }
}