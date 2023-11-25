class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int len = nums.length, totalSum = 0, currSum = 0;
        int[] res = new int[len];
        for(int num : nums) totalSum += num;
        for(int i=0; i<len; i++){
            res[i] = totalSum + nums[i]*i - currSum - nums[i]*(len-i);
            currSum += nums[i];
            totalSum -= nums[i];
        }
        return res;
    }
}