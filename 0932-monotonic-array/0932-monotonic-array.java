class Solution {
    public boolean isMonotonic(int[] nums) {
        int len = nums.length;
        boolean isIncreasing = true, isDecreasing = true;
        for(int i=1; i<len; i++){
            if(nums[i] > nums[i-1]) isDecreasing = false;
            else if(nums[i] < nums[i-1]) isIncreasing = false;
        }
        return isIncreasing || isDecreasing;
    }
}