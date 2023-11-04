class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        int leftMax = 0, rightMin = Integer.MAX_VALUE;
        for(int i=0; i<left.length; i++){
            leftMax = Math.max(leftMax, left[i]);
        }
        for(int i=0; i<right.length; i++){
            rightMin = Math.min(rightMin, right[i]);
        }
        return Math.max(leftMax, n - rightMin);
    }
}