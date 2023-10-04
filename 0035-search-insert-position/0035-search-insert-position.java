class Solution {
    public int searchInsert(int[] nums, int target) {
        // ans = len because if target is greater than max ele in array, the len is pos to insert the target
        int len = nums.length, low = 0, high = len-1, ans = len;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] < target) low = mid+1;
            else {
                ans = mid;
                high = mid-1;
            }
        }
        return ans;
    }
}