class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length, n2=nums2.length, low=0, high=nums1.length;
        if(n2<n1) return findMedianSortedArrays(nums2, nums1);
        int l1=Integer.MIN_VALUE, l2=Integer.MIN_VALUE, r1=Integer.MAX_VALUE, r2=Integer.MAX_VALUE;
        while(low<=high){
            int mid=(low+high)>>1;
            int cut1 = mid, cut2 = (n1+n2+1)/2 - cut1;
            l1 = (cut1==0) ? Integer.MIN_VALUE : nums1[cut1-1];
            l2 = (cut2==0) ? Integer.MIN_VALUE : nums2[cut2-1];
            r1 = (cut1==n1) ? Integer.MAX_VALUE : nums1[cut1];
            r2 = (cut2==n2) ? Integer.MAX_VALUE : nums2[cut2];
            
            if(l1 <= r2 && l2 <= r1){
                return ((n1+n2)&1)==0 ? (Math.max(l1,l2)+Math.min(r1,r2))/2.0 : Math.max(l1, l2);
            }
            else if(l1 > r2) high=mid-1;
            else low=mid+1;
        }
        return 0.0;
    }
}