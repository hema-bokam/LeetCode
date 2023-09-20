class Solution {
    public int waysToMakeFair(int[] nums) {
        int totalEvenSum = 0, totalOddSum = 0, len=nums.length; 
        for(int i=0; i<len; i++){
            if((i&1) == 0) totalEvenSum += nums[i];
            else totalOddSum += nums[i];
        }
        int i=0, evenSum =0, oddSum=0, count=0;
        while(i < len){
            int es = 0, os = 0;
            if((i&1) == 0){
                 es = evenSum + totalOddSum - oddSum;
                 os = oddSum + (totalEvenSum - nums[i]) - evenSum;
            }
            else{
                es = evenSum + (totalOddSum - nums[i]) - oddSum;
                os = oddSum + totalEvenSum - evenSum;
            }
            if(es == os) count++;
            if((i&1) == 0) evenSum += nums[i];
            else oddSum += nums[i];
            i++;
        }
        return count;
    }
}