class Solution {
    public int numSpecial(int[][] mat) {
        HashMap<Integer, Integer> rowMap = new HashMap<>();
        HashMap<Integer, Integer> colMap = new HashMap<>();
        int rows = mat.length, cols = mat[0].length, count=0;
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(mat[i][j] == 0){
                    rowMap.put(i, rowMap.getOrDefault(i, 0)+1);
                    colMap.put(j, colMap.getOrDefault(j, 0)+1);
                }
            }
        }
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(mat[i][j] == 1 && rowMap.getOrDefault(i, 0) == cols-1 && colMap.getOrDefault(j, 0) == rows-1) count++;
            }
        }
        return count;
    }
}