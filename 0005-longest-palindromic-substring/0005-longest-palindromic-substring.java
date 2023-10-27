class Solution {
    //appraoch: at every index go left and go right to check if it is palindrome or not
    // edge cases: we need to check for both odd len and even len palindromes
    public String longestPalindrome(String s) {
        int len = s.length(), max = 1, start = 0, end = 0;
        for(int k = 0; k<len; k++){
            int i=k, j=k;
            //check for odd len palindromes
            while(i>=0 && j<len && s.charAt(i) == s.charAt(j)){
                if(max < j-i+1){
                    max = j-i+1;
                    start = i;
                    end = j;
                }
                i--;
                j++;
            }
            i=k;
            j=k+1;
            //check for even len palindromes
            while(i >=0 && j<len && s.charAt(i) == s.charAt(j)){
                if(max < j-i+1){
                    max = j-i+1;
                    start = i;
                    end = j;
                }
                i--;
                j++;
            }
        }
        return s.substring(start, end+1);
    }
}