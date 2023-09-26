class NumMatrix {
    int[][] matrix;
    int[][] prefix;
    public NumMatrix(int[][] matrix) {
        this.matrix = matrix;
        this.prefix = findPrefixSum(matrix);
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        if(row1 == 0 && col1 == 0) return prefix[row2][col2];
        else if(row1 == 0) return prefix[row2][col2] - prefix[row2][col1-1];
        else if(col1 == 0) return prefix[row2][col2] - prefix[row1-1][col2];
        else return prefix[row2][col2] - prefix[row2][col1-1] - prefix[row1-1][col2] + prefix[row1-1][col1-1];
    }
    public int[][] findPrefixSum(int[][] m){
        int rows = m.length, cols = m[0].length;
        int[][] prefix = new int[rows][cols];
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(i==0 && j==0) prefix[i][j] = m[i][j];
                else if(i==0) prefix[i][j] = prefix[i][j-1] + m[i][j];
                else if(j==0) prefix[i][j] = prefix[i-1][j] + m[i][j];
                else prefix[i][j] = m[i][j] + prefix[i-1][j] + prefix[i][j-1] - prefix[i-1][j-1];
            }
        }
        return prefix;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */