class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int rows = triangle.size(), cols = rows, min = Integer.MAX_VALUE;
        int[][] dp = new int[rows][cols];
        for(int i=0; i<rows; i++){
            Arrays.fill(dp[i], -1);
        }
        int[] res = new int[cols];
        for(int i=0; i<cols; i++){
            res[i] = findMinPath(triangle, dp, rows-1, i);
            min = Math.min(res[i], min);
        }
        return min;
    }
    public int findMinPath(List<List<Integer>> tri, int[][] dp, int i, int j){
        // if(i<0 || j<0) return ;
        if(tri.get(i).size() <= j) return Integer.MAX_VALUE;
        if(i==0 && j==0) return dp[i][j]=tri.get(i).get(j);
        if(dp[i][j] != -1) return dp[i][j];
        int path1 = i > 0 ? findMinPath(tri, dp, i-1, j) : Integer.MAX_VALUE;
        int path2 = j > 0 ? findMinPath(tri, dp, i-1, j-1) : Integer.MAX_VALUE;
        dp[i][j] = tri.get(i).get(j) + Math.min(path1, path2);
        return dp[i][j];
    }
}