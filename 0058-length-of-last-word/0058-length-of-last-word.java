class Solution {
    public int lengthOfLastWord(String s) {
        int len = s.length(), i=len-1, ans = 0;
        boolean isExtraSpace = true;
        while(i >= 0){
            if(s.charAt(i) == ' '){
                if(ans == 0) i--;
                else break;
            }else{ 
                ans++;
                i--;
            }
        }
        return ans;
    }
}