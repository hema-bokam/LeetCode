class Solution {
    public int rob(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len];
        Arrays.fill(dp, -1);
        int res1 = len == 1 ? nums[0] : findMax(dp, nums, len-2);
        nums[0] = 0;
        Arrays.fill(dp, -1);
        int res2 = findMax(dp, nums, len-1);
        return Math.max(res1, res2);
    }
    public int findMax(int[] dp, int[] nums, int n){
        if(n < 0) return 0;
        if(n == 0) return nums[0];
        if(dp[n] != -1) return dp[n];
        dp[n] = Math.max(nums[n] +  findMax(dp, nums, n-2), findMax(dp, nums, n-1));
        return dp[n];
    }
}