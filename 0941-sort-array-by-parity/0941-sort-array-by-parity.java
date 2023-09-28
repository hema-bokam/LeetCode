class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int ei = 0, i = 0, len = nums.length;
        while(i < len){
            if((nums[i] % 2) == 0){
                int temp = nums[i];
                nums[i] = nums[ei];
                nums[ei] = temp;
                ei++;
                i++;
            }
            else i++;
        }
        return nums;
    }
}