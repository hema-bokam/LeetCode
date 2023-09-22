class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //reverse every rows
        for(int i=0; i<n; i++){
            reverse(matrix[i], n);
        }
    }
    public void reverse(int[] matrix, int len){
        int i=0, j=len-1;
        while(i < j){
            int temp = matrix[i];
            matrix[i] = matrix[j];
            matrix[j] = temp;
            i++;
            j--;
        }
    }
}