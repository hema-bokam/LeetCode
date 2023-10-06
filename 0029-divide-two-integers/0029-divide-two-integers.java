class Solution {
    public int divide(int dividend, int divisor) {
        int i = 31, sign = 1;
        //to handle overflows
        long quotient = 0,total=0, n = dividend, m = divisor;
        if(n < 0){
            sign *= -1;
            n = Math.abs(n);
        }
        if(m < 0){
            sign *= -1;
            m = Math.abs(m);
        }
        while(i >= 0){
            if((total + (m << i)) <= n){
                total += (m << i);
                quotient |= (long)1 << i;
            }
            i--;
        }
        if(sign < 0) quotient = -quotient;
        if(quotient > Integer.MAX_VALUE) return  Integer.MAX_VALUE;
        return (int)quotient;
    }
}