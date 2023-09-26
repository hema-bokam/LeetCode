class Solution {
    public int trap(int[] height) {
        int leftMax = 0, rightMax = 0, len = height.length, sum=0;
        int i=0, j=len-1;
        while(i <= j){
            if(leftMax <= rightMax){
                if(leftMax <= height[i]) leftMax = height[i];
                sum += leftMax - height[i];
                i++;
            }
            else{
                if(rightMax <= height[j]) rightMax = height[j];
                sum += rightMax - height[j];
                j--;
            }
        }
        return sum;
    }
}