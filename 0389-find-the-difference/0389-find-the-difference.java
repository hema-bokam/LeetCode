class Solution {
    public char findTheDifference(String s, String t) {
        //apply xor
        int len1 = s.length(), len2 = t.length(), xor = 0;
        for(int i=0; i<len1; i++) xor ^= (int)s.charAt(i);
        for(int i=0; i<len2; i++) xor ^= (int)t.charAt(i);
        return (char)xor;
    }
}