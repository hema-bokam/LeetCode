class Solution {
    public int arrangeCoins(int n) {
        int i = 1, coinsUsed = 0, completeRows = 0;
        while(i <= n){
            completeRows++;
            n -= i;
            i++;
        }
        return completeRows;
    }
}