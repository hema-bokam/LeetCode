class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])) map.put(nums[i],map.get(nums[i])+1);
            else map.put(nums[i],1);
        }
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])>1){
                map.put(nums[i],map.get(nums[i])-1);
                count+=map.get(nums[i]);
            }
        }
        return count;
    }
}