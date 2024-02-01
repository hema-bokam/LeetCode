class Solution {
    public int rob(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len];
        dp[0] = nums[0];
        for(int i=1; i<len; i++){
            dp[i] = Math.max(dp[i-1], (i >= 2 ? dp[i-2] : 0) + nums[i]);
        }
        return dp[len-1];
    }
}