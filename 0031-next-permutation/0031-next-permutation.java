class Solution {
    public void nextPermutation(int[] nums) {
        int len = nums.length, i = len-2;
        while(i >= 0 && nums[i] >= nums[i+1]) i--;
        if(i >= 0){
            int j = len-1;
            while(nums[j] <= nums[i]){
                j--;
            }
            //swap numbers
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        //sort this part 
        reverse(nums, i+1, len-1); // this part of array is in decreasing order 
        return;
    }
    public void reverse(int[] nums, int i, int j){
        while(i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        return;
    }
}