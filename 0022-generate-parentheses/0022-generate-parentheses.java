class Solution {
    List<String> res = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        StringBuilder sb = new StringBuilder("");
        generateParenthesis(sb, n, n);
        return res;
    }
    public void generateParenthesis(StringBuilder sb, int op, int cp){
        if(op < cp) return;
        if(op == 0 && cp == 0){
            String str = reverse(sb);
            res.add(str);
            return;
        }
        if(cp > 0){
            sb.append(')');
            generateParenthesis(sb, op, cp-1);
            sb.deleteCharAt(sb.length()-1);
        }
        if(op > 0){
            sb.append('(');
            generateParenthesis(sb, op-1, cp);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public String reverse(StringBuilder sb){
        StringBuilder str = new StringBuilder("");
        int size = sb.length(), i=size-1;
        while(i >= 0){
            str.append(sb.charAt(i));
            i--;
        }
        return str.toString();
    }
}