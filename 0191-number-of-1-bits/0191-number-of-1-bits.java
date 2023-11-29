public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int i=0, ans=0;
        while(i <= 31){
            if((n&1) == 1) ans++;
            n = n>>1;
            i++;
        }
        return ans;
    }
}