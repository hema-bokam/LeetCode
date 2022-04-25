class Solution {
    public boolean isPalindrome(int x) {
        int res=0,num=x;
        boolean bool=false;
        while(num>0){
            res=(res*10)+(num%10);
            num=num/10;
        }
        if(res==x && x>=0) bool=true;
        return bool;
    }
}