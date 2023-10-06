public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int i = 31, res = 0;
        while(i >= 0){
            if((n&1)==1) res += (1<<i);
            n = n>>1;
            i--;
        }
        return res;
    }
}