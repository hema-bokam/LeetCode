class Solution {
    public String addBinary(String a, String b) {
        int lenA = a.length(), lenB = b.length(), i = lenA-1, j = lenB-1;
        int carry = 0;
        StringBuilder sb = new StringBuilder("");
        while(i >= 0 || j >= 0){
            int val1 = 0, val2 = 0;
            if(i >= 0) val1 = (int)a.charAt(i--)-48;
            if(j >= 0) val2 = (int)b.charAt(j--)-48;
            int res = (carry + val1 + val2) % 2;
            carry = (carry + val1 + val2)/2;
            sb.append((char)(res+48));
        }
        if(carry == 1) sb.append('1');
        return reverse(sb).toString();
    }
    public StringBuilder reverse(StringBuilder sb){
        int len = sb.length(), i=0, j=len-1;
        while(i < j){
            char ch = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, ch);
            i++;
            j--;
        }
        return sb;
    }
}