class Solution {
    public int[] searchRange(int[] nums, int target) {
        int firstPos = findFirstPos(nums, target);
        if(firstPos == Integer.MAX_VALUE) return new int[]{-1,-1};
        int lastPos = findLastPos(nums, target);
        return new int[]{firstPos, lastPos};
    }
    public int findFirstPos(int[] nums, int target){
        int len = nums.length, s=0, e=len-1, pos = Integer.MAX_VALUE;
        while(s <= e){
            int m = s + (e-s)/2;
            if(nums[m] == target){
                e = m-1;
                pos = Math.min(pos, m);
            }
            else if(nums[m] < target) s = m+1;
            else e = m-1;
        }
        return pos;
    }
    public int findLastPos(int[] nums, int target){
        int len = nums.length, s=0, e=len-1, pos = Integer.MIN_VALUE;
        while(s <= e){
            int m = s + (e-s)/2;
            if(nums[m] == target){
                s = m+1;
                pos = Math.max(pos, m);
            }
            else if(nums[m] < target) s = m+1;
            else e = m-1;
        }
        return pos;
    }
}