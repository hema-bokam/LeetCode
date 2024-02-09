class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int rows = triangle.size(), cols = rows, min = Integer.MAX_VALUE;
        int[][] dp = new int[rows][cols];
        dp[0][0] = triangle.get(0).get(0);
        for(int i=1; i<rows; i++){
            for(int j=0; j<=i; j++){
                if(j==0) dp[i][j] = triangle.get(i).get(j) + dp[i-1][j];
                else if(j==i) dp[i][j] = triangle.get(i).get(j) + dp[i-1][j-1];
                else dp[i][j] = triangle.get(i).get(j) + Math.min(dp[i-1][j], dp[i-1][j-1]);
            }
        }
        for(int i=0; i<cols; i++) min = Math.min(dp[rows-1][i], min);
        return min;
    }
    
}