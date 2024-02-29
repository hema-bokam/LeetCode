class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length, len = strs[0].length();
        StringBuffer sb = new StringBuffer("");
        for(int i = 0; i<len; i++){
            for(int j=1; j<n; j++){
                if(i >= strs[j].length() || strs[0].charAt(i) != strs[j].charAt(i)) return sb.toString();
            }
            sb.append(strs[0].charAt(i));
        }
        return sb.toString();
    }
}