class Solution {
    public boolean isMatch(String s, String p) {
        int len1 = s.length(), len2 = p.length();
        int[][] dp = new int[len1][len2];
        for(int i=0; i<len1; i++) Arrays.fill(dp[i], -1);
        return isMatches(dp, s, p, len1-1, len2-1) == 1 ? true : false;
    }
    public int isMatches(int[][] dp, String s, String p, int i, int j){
        if(i<0 && j<0) return 1;
        if(j<0) return 0; 
        if(i<0 && j>=0){
            if(p.charAt(j) != '*') return 0;
            return isMatches(dp, s, p, i, j-2);
        }
        if(dp[i][j] != -1) return dp[i][j];
        int ans = 0;
        if(s.charAt(i) == p.charAt(j) || p.charAt(j) == '.'){
            ans = isMatches(dp, s, p, i-1, j-1);
        }
        else if(p.charAt(j) == '*'){
            if(s.charAt(i) == p.charAt(j-1) || p.charAt(j-1) == '.'){
                ans = isMatches(dp, s, p, i-1, j) | isMatches(dp, s, p, i, j-2);
            }
            else ans = isMatches(dp, s, p, i, j-2); 
        }else ans = 0;
        dp[i][j] = ans;
        return dp[i][j];
    }
}