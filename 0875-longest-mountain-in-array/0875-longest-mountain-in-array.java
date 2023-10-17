class Solution {
    public int longestMountain(int[] arr) {
        int len = arr.length;
        int[] prefix = new int[len];
        int[] suffix = new int[len];
        for(int i=1, j=len-2; i<len && j>=0; i++, j--){
            if(arr[i] > arr[i-1]){
                prefix[i] = prefix[i-1]+1;
            }
            if(arr[j] > arr[j+1]){
                suffix[j] = suffix[j+1] + 1;
            }
        }
        int max = 0;
        for(int i=0; i<len; i++){
            if(prefix[i] != 0 && suffix[i]!=0){
                max = Math.max(max, prefix[i]+suffix[i]+1);
            }
        }
        return max;
    }
}