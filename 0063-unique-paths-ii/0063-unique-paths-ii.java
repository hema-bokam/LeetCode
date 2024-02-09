class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int rows = obstacleGrid.length, cols = obstacleGrid[0].length;
        int[][] dp = new int[rows][cols];
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(i == 0) dp[i][j] = obstacleGrid[i][j] == 1 ? 0 : (j > 0 ? dp[i][j-1] : 1);
                else if(j==0) dp[i][j] = obstacleGrid[i][j] == 1 ? 0 : (i > 0 ? dp[i-1][j] : 1);
                else{
                    dp[i][j] = obstacleGrid[i][j] == 1 ? 0 : dp[i-1][j] + dp[i][j-1];
                }
            }
        }
        return dp[rows-1][cols-1];
    }
}