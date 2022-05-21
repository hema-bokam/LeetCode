class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] p=new int[nums.length];
        p[0]=1;
        for(int i=1;i<nums.length;i++){
            p[i]=p[i-1]*nums[i-1];
        }
        int right=1;
        for(int i=nums.length-1;i>=0;i--){
            int current=nums[i];
            nums[i]=right*p[i];
            right*=current;
        }
        return nums;
    }
}