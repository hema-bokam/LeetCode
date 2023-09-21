class Solution {
    //divide and conquer
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        return findMaxSum(nums, 0, len-1);
    }
    public int findMaxSum(int[] nums, int l, int r){
        if(l > r) return Integer.MIN_VALUE;
        int mid = (l+r)/2;
        int leftSum = 0, rightSum =0, currSum = 0;
        // find max contagious sum from left subarray mid-1 to l
        for(int i = mid-1; i>=l; i--){
            currSum += nums[i];
            leftSum = Math.max(leftSum, currSum);
        }
        currSum = 0;
        for(int i = mid+1; i<=r; i++){
            currSum += nums[i];
            rightSum = Math.max(rightSum, currSum);
        }
        return Math.max(Math.max(findMaxSum(nums, l, mid-1), findMaxSum(nums, mid+1, r)), leftSum + nums[mid] + rightSum);
    }
}