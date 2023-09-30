class Solution {
    public int findPairs(int[] nums, int k) {
        int len=nums.length, count=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int val : nums){
            if(!map.containsKey(val)){
                if(map.containsKey(val + k)) count++;
                if(map.containsKey(val - k)) count++;
            }
            if(map.containsKey(val)) map.put(val, map.get(val)+1);
            else map.put(val, 1);
        }
        return k != 0 ? count : findDiffZero(map);
    }
    public int findDiffZero(HashMap<Integer, Integer> map){
        int count = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > 1) count++;
        }
        return count;
    }
}