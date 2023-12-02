class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] charCount = new int[26];
        int len = chars.length(), ans=0;
        for(int i=0; i<len; i++){
            char ch = chars.charAt(i);
            charCount[ch-'a']++;
        }
        for(String word: words){
            int[] count = new int[26];
            int wordLen = word.length();
            for(int i=0; i<wordLen; i++){
                char ch = word.charAt(i);
                count[ch-'a']++;
            }
            boolean isPresent = true;
            for(int i=0; i<26; i++){
                if(count[i] > 0 && count[i] > charCount[i]){
                    isPresent = false;
                    break;
                }
            }
            if(isPresent) ans += wordLen;
        }
        return ans;
    }
}