class Solution {
    public int findDuplicate(int[] nums) {
        // binary search on possible answers
        // pigeonhole principle n+1 integers places in array of length n where elements lie between [1,n], then there must be atleast one integer repeated
        int len = nums.length, s = 1, e = len-1;  // min and max possible values of array element
        while(s < e){
            int mid = (s+e)/2;
            int count = 0;
            for(int i=0; i<len; i++){
                if(nums[i] <= mid) count++;
            }
            if(count <= mid) s = mid+1; 
            else e = mid;  // count>mid which means repeated number will be there. mid is also possible answer
        }
        return s;
    }
}