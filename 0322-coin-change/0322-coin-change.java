class Solution {
    public int coinChange(int[] coins, int amount) {
        int len = coins.length;
        int[][] dp = new int[len][amount+1];
        for(int i=0; i<len; i++) Arrays.fill(dp[i], -1);
        int ans = findMinCoins(coins, dp, len-1, amount);
        return ans < (int)Math.pow(10, 9) ? ans : -1;
    }
    public int findMinCoins(int[] coins, int[][] dp, int i, int amount){
        if(i == 0){
            if(amount % coins[i] == 0) return amount/coins[i];
            else return (int)Math.pow(10, 9);
        }
        if(dp[i][amount] != -1) return dp[i][amount];
        int notTake = findMinCoins(coins, dp, i-1, amount);
        int take = (int)Math.pow(10, 9);
        if(coins[i] <= amount){
            take = 1 + findMinCoins(coins, dp, i, amount - coins[i]);
        }
        return dp[i][amount] = Math.min(take, notTake);
    }
}