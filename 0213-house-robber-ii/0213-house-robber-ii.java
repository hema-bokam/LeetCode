class Solution {
    public int rob(int[] nums) {
        int len = nums.length;
        if(len == 1) return nums[0];
        int[] nums1 = new int[len];
        int[] nums2 = new int[len];
        for(int i=0; i<len; i++){
            if(i != 0) nums1[i] = nums[i];
            if(i != len-1) nums2[i] = nums[i];
        }
        return Math.max(findMax(nums1, len), findMax(nums2, len));
    }
    public int findMax(int[] nums, int n){
        int[] dp = new int[n];
        dp[0] = nums[0];
        for(int i=1; i<n; i++){
            dp[i] = Math.max(nums[i] + (i > 1 ? dp[i-2] : 0), dp[i-1]);
        }
        return dp[n-1];
    }
}