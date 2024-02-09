class Solution {
    public int minPathSum(int[][] grid) {
        int rows = grid.length, cols = grid[0].length;
        int[][] dp = new int[rows][cols];
        for(int i=0; i<rows; i++){
            Arrays.fill(dp[i], -1);
        }
        return findMinPathSum(dp, grid, rows-1, cols-1);
    }
    public int findMinPathSum(int[][] dp, int[][] grid, int i, int j){
        if(i<0 || j<0) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        if(i == 0) dp[i][j] = grid[i][j] + findMinPathSum(dp, grid, i, j-1);
        else if(j == 0) dp[i][j] = grid[i][j] + findMinPathSum(dp, grid, i-1, j);
        else dp[i][j] = grid[i][j] + Math.min(findMinPathSum(dp, grid, i-1, j), findMinPathSum(dp, grid, i, j-1));
        return dp[i][j];
    }
}