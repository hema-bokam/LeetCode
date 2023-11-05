class Solution {
    public int getWinner(int[] arr, int k) {
        int winner = 0, winningCount = 0;
        int nextPos=1, len = arr.length, rounds = 1;
        while(nextPos < len && rounds <= k){
            if(arr[0] < arr[nextPos])   swap(arr, 0, nextPos);
            if(winner == arr[0]) winningCount++;
            else{
                winner = arr[0];
                winningCount = 1;
            }
            nextPos++;
            if(winningCount == k) return winner;
        }
        return winner;
    }
    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}