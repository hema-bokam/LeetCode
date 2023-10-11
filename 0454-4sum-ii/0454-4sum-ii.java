class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        for(int num1 : nums1){
            for(int num2 : nums2){
                map.put(num1+num2, map.getOrDefault(num1+num2, 0)+1);
            }
        }
        for(int num3 : nums3){
            for(int num4 : nums4){
                ans += map.getOrDefault(-(num3+num4), 0);
            }
        }
        return ans;
    }
}