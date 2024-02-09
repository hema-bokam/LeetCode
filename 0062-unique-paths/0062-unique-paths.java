class Solution {
    public int uniquePaths(int m, int n) {
        int[] curr = new int[n];
        int[] prev = new int[n];
        Arrays.fill(prev, 1);
        for(int i=1; i<m; i++){
            for(int j=0; j<n; j++){
                if(j == 0) curr[j] = 1;
                else curr[j] = prev[j] + curr[j-1];
            }
            prev = curr;
        }
        return prev[n-1];
    }
}