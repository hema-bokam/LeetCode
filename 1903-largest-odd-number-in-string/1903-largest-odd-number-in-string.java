class Solution {
    public String largestOddNumber(String num) {
        int len = num.length(), i=len-1;
        while(i >= 0){
            int n =(int)num.charAt(i) - 48;
            if((n&1) == 1) return num.substring(0, i+1);
            i--;
        }
        return "";
    }
}