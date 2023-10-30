class Solution {
    public int myAtoi(String s) {
       boolean isNegative = false, isNumStarted = false, isPositive = false;
        int len = s.length(), i=0;
        long num = 0;
        while(i < len){
            if(s.charAt(i) == ' ' && !isNumStarted && !isNegative && !isPositive) i++;
            else if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                isNumStarted = true;
                int val = (int)s.charAt(i)-48;
                if(!isNegative && (num*10 + val) > Integer.MAX_VALUE){
                    num = Integer.MAX_VALUE;
                    break;
                }else if(isNegative && (-1*(num * 10 + val)) < Integer.MIN_VALUE){
                    num = Math.abs(Integer.MIN_VALUE);
                    break;
                }else{
                    num = num * 10 + val;
                    i++;
                }
            }else{
                if(isNumStarted) break;
                else if(s.charAt(i) == '-' || s.charAt(i) == '+'){
                    if(isPositive || isNegative) break;
                    if(s.charAt(i) == '-') isNegative = true;
                    else isPositive = true;
                    i++;
                }else break;
            }
        }
        return isNegative ? (int)(-1*num) : (int)num;
    }
}