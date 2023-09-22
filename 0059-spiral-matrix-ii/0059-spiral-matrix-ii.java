class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int p = 0, q = n-1, val = 1;
        while(p < q){
            for(int i=p; i<q; i++){
                res[p][i] = val++;
            }
            for(int i=p; i<q; i++){
                res[i][q] = val++;
            }
            for(int i=q; i>p; i--){
                res[q][i] = val++;
            }
            for(int i=q; i>p; i--){
                res[i][p] = val++;
            }
            p++;
            q--;
        }
        if(p==q) res[p][q] = val;
        return res;
    }
}