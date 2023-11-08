class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(board[i][j] != '.'){
                    if(!isValid(board, i, j, board[i][j])){
                        System.out.println("i: "+i + " j: "+j);
                         return false;
                    }
                }
            }
        }
        return true; 
    }
    public boolean isValid(char[][] board, int row, int col, char ch){
        for(int i=0; i<9; i++){
            if(i != col && board[row][i] == ch) return false;
            if(i != row && board[i][col] == ch) return false;
            int boxRow = 3*(row/3) + (i/3), boxCol = 3*(col/3) + (i % 3);
            if(boxRow != row && boxCol != col && board[boxRow][boxCol] == ch) return false;
        }
        return true;
    }
}