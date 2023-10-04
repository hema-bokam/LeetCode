class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //whole matrix is sorted, assue all ele are added in a list
        // high ele index is rows*cols-1 because total ele = rows*cols
        int low = 0, rows = matrix.length, cols = matrix[0].length, high = rows*cols-1, ans = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            // find row and col number -> every row has cols elements
            int r = mid/cols, c = mid%cols;
            if(matrix[r][c] > target)  high = mid-1;
            else{
                ans = mid;
                low = mid+1;
            }
        } 
        if(ans == -1 || matrix[ans / cols][ans % cols] != target) return false;
        return true;
    }
}