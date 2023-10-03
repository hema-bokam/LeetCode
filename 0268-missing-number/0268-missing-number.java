class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        for(int i=0; i<len; i++){
            if(i == nums[i] || nums[i] >= len) continue;
            while(i != nums[i] && nums[i] < len){
                int temp = nums[nums[i]];
                nums[nums[i]]= nums[i];
                nums[i] = temp;
            }
        }
        for(int i=0; i<len; i++){
            if(nums[i] != i) return i; 
        }
        return len;
    }
}