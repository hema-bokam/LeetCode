class Solution {
    public int numSpecial(int[][] mat) {
        int rows = mat.length, cols = mat[0].length, count=0;
        int[] rowCount = new int[rows],  colCount = new int[cols];
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(mat[i][j] == 1){
                    rowCount[i]++;
                    colCount[j]++;
                }
            }
        }
        for(int i=0; i<rows; i++){
            if(rowCount[i] == 1){
                for(int j=0; j<cols; j++){
                    if(colCount[j] == 1 && mat[i][j] == 1) count++;
                }
            }
        }
        return count;
    }
}