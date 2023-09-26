class Solution {
    public int firstMissingPositive(int[] nums) {
        int len=nums.length;
        for(int i=0; i<len; i++){
            if(nums[i] == i+1 || nums[i] <=0 || nums[i] > len) continue;
            while(nums[i] > 0 && nums[i] <= len && nums[i] != i+1 && nums[nums[i]-1] != nums[i]){
                int temp = nums[i];
                nums[i] = nums[nums[i] - 1];
                nums[temp - 1] = temp; 
            }
        }
        for(int i=0; i<len; i++){
            if(nums[i] != i+1) return i+1;
        }
        return len+1;
    }
}