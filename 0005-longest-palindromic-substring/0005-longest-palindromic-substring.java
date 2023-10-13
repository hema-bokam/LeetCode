class Solution {
    public String longestPalindrome(String s) {
        int len = s.length(), ans = 0, start = 0, end = 0;
        for(int i=0; i<len; i++){
            for(int j=i; j<len; j++){
                if(isPalindrome(s.substring(i, j+1))){
                    if(ans < j+1-i){
                        ans = j+1-i;
                        start = i;
                        end = j+1;
                    }
                }
            }
        }
        return s.substring(start, end);
    }
    public boolean isPalindrome(String s){
        int i=0, j=s.length()-1;
        while(i < j){
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}