class Solution {
    public boolean isPowerOfFour(int n) {
        if(n <= 0) return false;
        if(n == 1) return true;
        double logNtoBase4 = Math.log(n)/Math.log(4);
        return logNtoBase4 == (int)logNtoBase4;
    }
}