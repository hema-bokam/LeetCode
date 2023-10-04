class Solution {
    public int mySqrt(int x) {
        long low = 0, high = x, ans = 0;
        while(low <= high){
            long mid = low + (high-low)/2;
            long square = mid*mid;
            if(square == (long)x) return (int)mid;
            else if(square < x){
                ans = mid;
                low = mid+1;
            }
            else high = mid-1;
        }
        return (int)ans;
    }
}