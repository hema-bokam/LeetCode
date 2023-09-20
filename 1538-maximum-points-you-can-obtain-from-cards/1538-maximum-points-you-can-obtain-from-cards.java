class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int len = cardPoints.length, sum=0, j=len-1, i=0;
        while(i < k){
            sum += cardPoints[i++];
        }
        if(len == k) return sum;
        int max = sum;
        i = i-1;
        while(i>=0){
            sum = sum - cardPoints[i] + cardPoints[j];
            max = Math.max(max, sum);
            i--;
            j--;
        }
        return max;
    }
}