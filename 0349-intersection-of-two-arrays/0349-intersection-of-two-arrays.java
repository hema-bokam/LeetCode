class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        int len1 = nums1.length, len2 = nums2.length;
        for(int i=0; i<len1; i++){
            set.add(nums1[i]);
        }
        HashSet<Integer> intersectionSet = new HashSet<>();
        for(int i=0; i<len2; i++){
            if(set.contains(nums2[i])) intersectionSet.add(nums2[i]);
        }
        int size = intersectionSet.size(), x=0;
        int[] res = new int[size];
        for(int num : intersectionSet){
            res[x++] = num;
        }
        return res;
    }
}