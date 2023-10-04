class Solution {
    public int singleNonDuplicate(int[] nums) {
        int len = nums.length, low = 0, high = len-1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(mid > 0 && nums[mid] == nums[mid-1]){
                int leftSubArrLen = mid-low+1;
                if(leftSubArrLen % 2 == 0) low = mid+1;
                else high = mid-2;  
            }
            else if(mid < len-1 && nums[mid] == nums[mid+1]){
                int rightSubArrLen = high-mid+1;
                if(rightSubArrLen % 2 == 0) high = mid-1;
                else low = mid+2;
            }
            else return nums[mid];
        }
        return -1;
    }
}