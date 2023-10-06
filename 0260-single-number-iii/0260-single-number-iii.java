class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0, len = nums.length;
        for(int num : nums){
            xor ^= num;
        }
        int i=0;
        while(i <= 31){
            if(((xor >> i) & 1) == 1){
                break;
            }
            i++;
        }
        int a=0, b=0;
        for(int num : nums){
            if(((num >> i) & 1) == 1) a ^= num;
            else b ^= num;
        }
        return new int[]{a,b};
    }
}