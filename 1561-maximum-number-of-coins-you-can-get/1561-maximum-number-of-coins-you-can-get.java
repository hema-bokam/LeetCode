class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int i=0, len = piles.length, j=len-1, myCoins = 0;
        while(i < j){
            myCoins += piles[--j];
            --j;
            i++;
        }
        return myCoins;
    }
}