class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int len = nums.length, i=0, j=0, count=0;
        while(i < len && j < len){
            if(i==j) {
                j++;
                continue;
            }
            int diff = nums[j] - nums[i];
            if(diff < k) j++;
            else if(diff > k) i++;
            else{
                count++;
                int val1 = nums[i], val2 = nums[j];
                while(i < len && nums[i] == val1) i++;
                while(j < len && nums[j] == val2) j++;
            }
        }
        return count;
    }
}