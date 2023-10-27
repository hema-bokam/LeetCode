class Solution {
    public String longestPalindrome(String s) {
        int length = s.length(), maxLen = 1, start = 0, end = 0;
        boolean[][] dp = new boolean[length][length]; // to store wheather s[i to j] is palindrome or not
        for(int i=0; i<length; i++){
            //for length 1 substring
             dp[i][i] = true;
             //for length 2 substrings
             if(i != length-1){
                if(s.charAt(i) == s.charAt(i+1)){
                    dp[i][i+1] = true;
                    start = i;
                    end = i+1;
                }
             }
        }
        //checking for lengths 3 to string length
        for(int len = 3; len <= length; len++){
            for(int i=0; i<=length-len; i++){
                int j = i + len - 1;
                if(s.charAt(i) == s.charAt(j) && dp[i+1][j-1]){
                    dp[i][j] = true;
                    start = i;
                    end = j;
                }
            }
        }
            
        return s.substring(start, end+1);
    }
}