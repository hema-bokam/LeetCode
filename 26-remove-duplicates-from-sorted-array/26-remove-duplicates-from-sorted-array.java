class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0,j=1;
        while(i<nums.length && j<nums.length){
            if(nums[i]==nums[j]) j++;
            else{
                if(j-i==1){
                    i++;
                    j++;
                }
                else nums[++i]=nums[j];
            }
        }
        return i+1;  
    }
}