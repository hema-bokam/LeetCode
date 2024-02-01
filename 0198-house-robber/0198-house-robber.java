class Solution {
    public int rob(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len];
        Arrays.fill(dp, -1);
        return findMaxMoney(dp, nums, len-1);
    }
    public int findMaxMoney(int[] dp, int[] nums, int n){
        if(n < 0) return 0;
        if(n == 0) return dp[0] = nums[0];
        if(dp[n] != -1) return dp[n];
        dp[n] = Math.max(nums[n] + findMaxMoney(dp, nums, n-2),
                        findMaxMoney(dp, nums, n-1));
        return dp[n];
    }
}