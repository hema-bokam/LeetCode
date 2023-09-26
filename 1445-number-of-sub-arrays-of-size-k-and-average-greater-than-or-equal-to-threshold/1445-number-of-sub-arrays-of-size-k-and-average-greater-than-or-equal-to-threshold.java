class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int len = arr.length, count=0, sum=0;
        for(int i=0; i<len; i++){
            if(i < k) sum += arr[i];
            if(i == k-1){
                if(sum/k >= threshold) count++;
            }
            if(i>=k){
                sum += (arr[i] - arr[i-k]);
                if(sum/k >= threshold) count++;
            }
        }
        return count;
    }
}