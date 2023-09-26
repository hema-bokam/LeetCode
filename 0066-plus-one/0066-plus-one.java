class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1, len = digits.length;
        for(int i=len-1; i>=0; i--){
            int sum = digits[i] + carry;
            digits[i] = sum % 10;
            carry = sum/10; 
        }
        if(carry == 0) return digits;
        int[] res = new int[len+1];
        res[0] = carry;
        for(int i=0; i<len; i++){
            res[i+1] = digits[i];
        }
        return res;
    }
}