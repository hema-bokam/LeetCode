class Solution {
    public int[] findArray(int[] pref) {
        int len = pref.length, xor = pref[0];
        for(int i=1; i<len; i++){
            pref[i] = pref[i] ^ xor;
            xor ^= pref[i];
        }
        return pref;
    }
}