class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0, i=0, j=0, p = 1, len=nums.length;
        boolean update = true;
        while(i<len && j<len){
            if(update) p = p*nums[j];
            if(p >= k){
                p = (p/nums[i] == 0) ? 1 : p/nums[i];
                i++;
                update = false;
                continue;
            }
            if(p < k){
                System.out.println(p);
                int n = j-i+1;
                count += n;
            }
            j++;
            update = true;
        }
        return count;
    }
}