class Solution {
    public double myPow(double x, int n) {
        boolean inversePower = n < 0 ? true : false;
        double res = findPower(x, Math.abs(n));
        if(inversePower) return 1/res;
        return res;
    }
    public double findPower(double x, int n){
        if(x == 0) return 0;
        if(n == 0) return 1;
        double halfPower = findPower(x, n/2);
        if((n & 1)==0) return halfPower * halfPower;
        else return x*halfPower*halfPower;
    }
}