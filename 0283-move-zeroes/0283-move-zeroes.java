class Solution {
    public void moveZeroes(int[] nums) {
        int i=0, j=0, len = nums.length;
        while(j < len){
            if(nums[j] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++; 
            }
            else j++;
        }
        
    }
}