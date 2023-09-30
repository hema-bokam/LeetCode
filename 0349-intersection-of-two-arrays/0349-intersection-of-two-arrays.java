class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        HashSet<Integer> set = new HashSet<>();
        Arrays.sort(nums2);
        for(int val : nums1){
            if(binarySearch(nums2, val)) set.add(val);
        }
        return set.stream().mapToInt(val -> val).toArray();
    }
    public boolean binarySearch(int[] nums, int target){
        int s=0, e=nums.length-1;
        while(s <= e){
            int m = s + (e-s)/2;
            if(nums[m] == target) return true;
            else if(nums[m] < target) s = m+1;
            else e = m-1;
        }
        return false;
    }
}