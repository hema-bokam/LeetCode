class Solution {
    int count = 0;
    public int reversePairs(int[] nums) {
        int len = nums.length;
        divideAndConquer(nums, 0, len-1);
        return count;
    }
    public void divideAndConquer(int[] nums, int l, int r){
        if(l>=r) return;
        int m = l+(r-l)/2;
        divideAndConquer(nums, l, m);
        divideAndConquer(nums, m+1, r);
        merge(nums, l, m, r);
    }
    public void merge(int[] nums, int l, int m, int r){
        int s1 = m-l+1, s2 = r-m, index = 0;
        int[] arr1=new int[s1];
        int[] arr2 = new int[s2];
        for(int k=l;k<=m;k++) arr1[index++] = nums[k];
        index = 0;
        for(int k=m+1; k<=r; k++) arr2[index++] = nums[k];
        int i=0, j=0;
        while(i<s1 && j<s2){
            if((long)arr1[i] > (long)2*arr2[j]){
                count += (s1-i);
                j++;
            }else i++;
        }
        i=0;
        j=0;
        index=l;
        while(i<s1 && j<s2){
            if(arr1[i] < arr2[j])  nums[index++] = arr1[i++];
            else nums[index++] = arr2[j++];
        } 
        while(i<s1)  nums[index++] = arr1[i++];
        while(j<s2)  nums[index++] = arr2[j++];
    }
}