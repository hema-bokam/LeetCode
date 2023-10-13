class Solution {
    // using KMP algorithm 
    public int strStr(String haystack, String needle) {
        String str = needle + "$" + haystack;
        int len = str.length(), patternLen = needle.length();
        int[] lps = new int[len];
        lps[0] = 0;
        // build lps array
        for(int i = 1; i<len; i++){
            int x = lps[i-1];
            while(str.charAt(i) != str.charAt(x)){
                if(x == 0){
                    x = -1;
                    break;
                }
                x = lps[x-1];
            }
            lps[i] = x+1;
        }
        for(int i=patternLen+1; i<len; i++){
            if(lps[i] == patternLen) return (i - (2*patternLen));
        }
        return -1;
    }
}