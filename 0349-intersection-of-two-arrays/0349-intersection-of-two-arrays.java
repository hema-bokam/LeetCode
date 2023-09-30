class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> arr = new ArrayList<>();
        int i=0, j=0, len1 = nums1.length, len2 = nums2.length;
        while(i<len1 && j<len2){
            if(nums1[i] < nums2[j]) i++;
            else if(nums2[j] < nums1[i]) j++;
            else{
                int val = nums1[i];
                arr.add(val);
                while(i<len1 && nums1[i] == val) i++;
                while(j<len2 && nums2[j] == val) j++;
            }
        }
        int[] res = arr.stream().mapToInt(val -> val).toArray();
        return res;
    }
}