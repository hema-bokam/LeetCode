class Solution {
    public int thirdMax(int[] nums) {
        Integer max1 = nums[0], max2 = null, max3 = null;
        int len = nums.length;
        for(int i=1; i<len; i++){
            if(max1 == nums[i] || (max2 != null && max2 == nums[i]) || (max3 != null && max3 == nums[i])) continue;
            if(nums[i] > max1){
                max3 = max2;
                max2 = max1;
                max1 = nums[i];
            }
            else if(max2 == null) max2 = nums[i];
            else if(nums[i] > max2){
                max3 = max2;
                max2 = nums[i];
            }
            else if(max3 == null || nums[i] > max3) max3 = nums[i];
        }
        return max3 != null ? max3 : max1;
    }
}