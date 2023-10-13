class Solution {
    public String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder(s);
        int i=0, len = s.length();
        while(i < len){
            if(sb.charAt(i) >= 65 && sb.charAt(i) <= 90){
                char ch = (char)((sb.charAt(i) - 65) + 97);
                sb.setCharAt(i, ch);
            }
            i++;
        }
        return sb.toString();
    }
}