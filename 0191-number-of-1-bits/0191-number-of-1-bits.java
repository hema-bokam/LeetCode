public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int i = 0, count=0;
        while(i <= 31){
            if((n&1) == 1) count++;
            n = n>>1;
            i++;
        }
        return count;
    }
}