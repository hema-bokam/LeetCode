class Solution {
    public int[] sortArray(int[] nums) {
        int len = nums.length;
        mergeSort(nums, 0, len-1);
        return nums;
    }
    public void mergeSort(int[] nums, int l, int r){
        if(l >= r) return;
        int m = l + (r-l)/2;
        mergeSort(nums, l, m);
        mergeSort(nums, m+1, r);
        merge(nums, l, m, r);
        return;
    }
    public void merge(int[] nums, int l, int m, int r){
        int size1 = m-l+1, size2 = r-m; 
        int[] arr1 = new int[size1];
        int[] arr2 = new int[size2];
        for(int idx=l, x=0; idx<=m; idx++) arr1[x++] = nums[idx];
        for(int idx=m+1, x=0; idx<=r; idx++) arr2[x++] = nums[idx];
        int i=0, j=0, index = l;
        while(i<size1 && j<size2){
            if(arr1[i] < arr2[j]) nums[index++] = arr1[i++];
            else nums[index++] = arr2[j++];
        }
        while(i<size1) nums[index++] = arr1[i++];
        while(j<size2) nums[index++] = arr2[j++];
        return;
    }
}