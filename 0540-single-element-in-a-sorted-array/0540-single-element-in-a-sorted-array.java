class Solution {
    public int singleNonDuplicate(int[] nums) {
        int len = nums.length, low = 0, high = len-1, ans = 0;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(mid == len-1) return nums[len-1];
            if(nums[mid] == nums[mid+1]) mid++;
            //we are checking for index <= mid 
            //if mid is odd which means subarraylen is even so all are duplicate, move left
            if(mid % 2 == 1) low = mid+1;
            //if mid is even which means subarraylen is odd so duplicate will be in [0, mid] range.
            else{
                ans = mid;
                high = mid-1;
            } 
        }
        return nums[ans];
    }
}