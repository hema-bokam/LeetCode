class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int len = nums.length, sum=0;
        map.put(0, 0);
        for(int i=0; i<len; i++){
            sum += nums[i];
            int r = sum % k;
            if(!map.containsKey(r)) map.put(r, i+1);
            else if(map.get(r) < i) return true;
        }
        return false;
    }
}