class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int len = nums.length, left = -1, right = -1, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for(int i=0, j=len-1; i<len && j>=0; i++, j--){
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[j]);
            if(nums[i] < max) right = i;
            if(nums[j] > min) left = j;
        }
        if(left == -1 && right == -1) return 0;
        return right - left + 1;
    }
}