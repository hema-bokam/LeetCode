class Solution {
    public int largestSubmatrix(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length, max = 0;
        for(int j=0; j<cols; j++){
            for(int i=0; i<rows; i++){
                if(matrix[i][j] == 1 && i>0) matrix[i][j] = matrix[i-1][j] + 1;
            }
        }
        for(int i=0; i<rows; i++){
            Arrays.sort(matrix[i]);
            for(int j=cols-1; j>=0; j--){
                max = Math.max(max, matrix[i][j] * (cols - j));
            }
        }
        return max;    
    }
}