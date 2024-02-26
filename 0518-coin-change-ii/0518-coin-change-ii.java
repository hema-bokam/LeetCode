class Solution {
    public int change(int amount, int[] coins) {
        int len = coins.length;
        int[][] dp = new int[len][amount+1];
        for(int i=0; i<len; i++) Arrays.fill(dp[i], -1);
        return totalCombinations(coins, dp, len-1, amount);
    }
    public int totalCombinations(int[] coins,int[][] dp,int i,int amount){
        if(amount == 0) return 1;
        if(amount < 0 || i < 0) return 0;
        if(dp[i][amount] != -1) return dp[i][amount];
        int notTake = totalCombinations(coins, dp, i-1, amount);
        int take = totalCombinations(coins, dp, i, amount - coins[i]);
        return dp[i][amount] = take + notTake;
    }
}