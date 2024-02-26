class Solution {
    public int change(int amount, int[] coins) {
        int len = coins.length;
        int[][] dp = new int[len][amount+1];
        for(int i=0; i<len; i++){
            for(int j=0; j<=amount; j++){
                if(i == 0) dp[i][j] = (j % coins[i] == 0) ? 1 : 0;
                else{
                    int notTake = dp[i-1][j];
                    int take = 0;
                    if(coins[i] <= j){
                        take = dp[i][j - coins[i]];
                    }
                    dp[i][j] = take + notTake;
                }
            }
        }
        return dp[len-1][amount];
    }
}