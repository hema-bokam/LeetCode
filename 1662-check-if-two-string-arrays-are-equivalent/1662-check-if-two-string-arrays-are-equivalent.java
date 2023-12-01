class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int idx1 = 0, idx2 = 0, i=0, j=0, len1 = word1.length, len2 = word2.length;
        while(idx1 < len1 && idx2 < len2){
            if(word1[idx1].charAt(i) != word2[idx2].charAt(j)) return false;
            i++;
            j++;
            if(i >= word1[idx1].length()){
                idx1++;
                i=0;
            }
            if(j >= word2[idx2].length()){
                idx2++;
                j=0;
            }
        }
        return idx1 == len1 && idx2 == len2;
    }
}