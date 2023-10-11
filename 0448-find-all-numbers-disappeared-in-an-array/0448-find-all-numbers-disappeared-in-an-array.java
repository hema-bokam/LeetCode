class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int len = nums.length;
        for(int i=0; i<len; i++){
            if(nums[i] == i+1 || nums[i] > len || nums[i] == nums[nums[i]-1]) continue;
            while(nums[i] != i+1 && nums[i] <= len && nums[i] != nums[nums[i]-1]){
                int temp = nums[i];
                nums[i] = nums[nums[i]-1];
                nums[temp-1] = temp;
            }
        }
        for(int i=0; i<len; i++){
            if(nums[i] != i+1) res.add(i+1);
        }
        return res;
    }
}