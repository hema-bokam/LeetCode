class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int rows = obstacleGrid.length, cols = obstacleGrid[0].length;
        int[][] dp = new int[rows][cols];
        for(int i=0; i<rows; i++){
            Arrays.fill(dp[i], -1);
        }
        return findTotalUniquePathsWithObstacles(dp, obstacleGrid, rows-1, cols-1);
    }
    public int findTotalUniquePathsWithObstacles(int[][] dp, int[][] obstacleGrid, int m, int n){
        if(m<0 || n<0 || obstacleGrid[m][n] == 1) return 0;
        if(m == 0 && n==0) return 1;
        if(dp[m][n] != -1) return dp[m][n];
        return dp[m][n] = findTotalUniquePathsWithObstacles(dp, obstacleGrid, m-1, n) + findTotalUniquePathsWithObstacles(dp, obstacleGrid, m, n-1);
    }
}