class Solution {
    public void rotate(int[] nums, int k) {
        reverse(nums,0,nums.length-1);
        k=k%(nums.length);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
    public void reverse(int[] n,int s,int e){
        while(s<e){
            n[s]=n[s]+n[e];
            n[e]=n[s]-n[e];
            n[s]=n[s]-n[e];
            s++;
            e--;
        }
        return;
    }
}