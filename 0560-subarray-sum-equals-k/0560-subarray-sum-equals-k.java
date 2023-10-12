class Solution {
    public int subarraySum(int[] nums, int k) {
        int len = nums.length, count=0;
        int[] prefix = new int[len];
        prefix[0] = nums[0];
        for(int i=1; i<len; i++){
            prefix[i] = prefix[i-1]+nums[i];
        }
        // prefix[j] - prefix[i-1] = k, subarray i to j has sum k
        // prefix[j] = prefix[i-1]+k
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<len; i++){
            if(prefix[i] == k){
                 count++;
                 //continue;
            }
            if(map.containsKey(prefix[i])) count += map.get(prefix[i]);
            map.put(prefix[i]+k, map.getOrDefault(k+prefix[i], 0)+1); 
        }
        return count;
    }
}