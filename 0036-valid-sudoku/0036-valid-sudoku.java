class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer, HashSet<Character>> rows = new HashMap<>();
        HashMap<Integer, HashSet<Character>> cols = new HashMap<>();
        HashMap<Integer, HashSet<Character>> boxes = new HashMap<>();
        for(int i=0; i<9; i++){
            rows.put(i, rows.getOrDefault(i, new HashSet<>()));
            for(int j=0; j<9; j++){
                cols.put(j, cols.getOrDefault(j, new HashSet<>()));
                if(board[i][j] != '.'){
                    char ch = board[i][j];
                    int boxNum = 3*(i/3) + (j/3);
                    boxes.put(boxNum, boxes.getOrDefault(boxNum, new HashSet<>()));
                    if(rows.get(i).contains(ch) || cols.get(j).contains(ch) || boxes.get(boxNum).contains(ch)) return false; 
                    rows.get(i).add(ch);
                    cols.get(j).add(ch);
                    boxes.get(boxNum).add(ch);
                }
            }
        }
        return true; 
    }
}