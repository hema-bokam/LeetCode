class Solution {
    public boolean isPerfectSquare(int num) {
        int low = 1, high = num;
        while(low <= high){
            int mid = low+(high-low)/2;
            int quotient = num/mid, remainder = num % mid;
            if(quotient == mid && remainder == 0) return true;
            else if(mid < quotient) low = mid+1;
            else high = mid-1; 
        }
        return false;
    }
}