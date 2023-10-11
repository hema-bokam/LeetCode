class Solution {
    public int firstUniqChar(String s) {
        int[] chars = new int[26];
        int len = s.length();
        for(int i=0; i<len; i++) chars[s.charAt(i)-'a']++;
        for(int i=0; i<len; i++){
            if(chars[s.charAt(i)-'a'] == 1) return i;
        }
        return -1;
    }
}