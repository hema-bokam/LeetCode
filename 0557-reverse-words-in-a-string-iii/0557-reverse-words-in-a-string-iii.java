class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder("");
        int i=0, len=s.length(), j=0;
        while(j < len){
            char ch = s.charAt(j);
            if(ch != ' ') j++;
            else{
                reverse(s, sb, i, j-1);
                i = j+1;
                j++;
                sb.append(' ');
            }
        }
        reverse(s, sb, i, j-1);
        return sb.toString();
    }
    public void reverse(String s, StringBuilder sb, int i, int j){
        while(j >= i){
            sb.append(s.charAt(j));
            j--;
        }
    }
}