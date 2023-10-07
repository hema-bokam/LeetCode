class Solution {
    public int totalHammingDistance(int[] nums) {
        int len = nums.length, temp = 0, count = 0;
        while(temp <= 31){
            int ones=0, zeroes=0;
            for(int i=0; i<len; i++){
                if(((nums[i] >> temp) & 1) == 1) ones++;
                else zeroes++;
            }
            count += (zeroes*ones);
            temp++;
        }
        return count;
    }
}