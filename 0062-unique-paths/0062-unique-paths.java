class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int i=0; i<m; i++){
            Arrays.fill(dp[i], -1);
        }
        return findTotalUniquePaths(dp, m-1, n-1);
    }
    public int findTotalUniquePaths(int[][] dp, int m, int n){
        if(m < 0 || n < 0) return 0;
        if(m == 0 && n == 0) return dp[m][n] = 1;
        if(dp[m][n] != -1) return dp[m][n];
        return dp[m][n] = findTotalUniquePaths(dp, m-1, n) + findTotalUniquePaths(dp, m, n-1);
    }
}