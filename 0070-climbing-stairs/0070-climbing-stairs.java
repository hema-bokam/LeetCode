class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return findWays(dp, n);
    }
    public int findWays(int[] dp, int n){
        if(n <= 0) return 0;
        if(n == 1) return dp[n] = 1;
        if(n == 2) return dp[n] = 2;
        if(dp[n] != -1) return dp[n];
        dp[n] = findWays(dp, n-1) + findWays(dp, n-2);
        return dp[n];
    }
}