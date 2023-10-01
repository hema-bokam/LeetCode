class Solution {
    public int alternatingSubarray(int[] nums) {
        int len= nums.length, i=0, j=1, diff = 1, max=-1;
        while(i<len && j < len){
            if(nums[j] - nums[j-1] == diff){
                max = Math.max(max, j-i+1);
                j++;
                diff *= -1;
            }
            else{
                i++;
                j = i+1;
                diff = 1;
            }
        }
        return max;
    }
}