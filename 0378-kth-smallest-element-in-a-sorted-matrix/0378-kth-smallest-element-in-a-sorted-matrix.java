class Solution {
    // since matrix is row and col wise sorted, we can apply BS on answer space
    public int kthSmallest(int[][] matrix, int k) {
        int rows = matrix.length, cols = rows;
        int low = matrix[0][0], high = matrix[cols-1][cols-1];
        while(low <= high){
            int mid = (low + high)/2;
            int count = 0, maxNum = low;
            for(int r = 0, c = cols-1; r< rows; r++){
                if(matrix[r][0] > mid) break;  // if current row first ele is greater than mid, then next rows elements will be greater for sure
                while(c >= 0 && matrix[r][c] > mid) c--;
                count += (c+1);
                if(c>=0) maxNum = Math.max(maxNum, matrix[r][c]);
            }
            if(count == k) return maxNum;
            else if(count < k) low = mid+1;
            else high = mid-1;
        }
        return low;
    }
}