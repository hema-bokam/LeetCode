class Solution {
    public int kthGrammar(int n, int k) {
        if(k == 1) return 0;
        int totalEle = (int)Math.pow(2, n-1);
        if(k <= totalEle/2) return kthGrammar(n-1, k);
        return 1^kthGrammar(n-1, k-totalEle/2);
    }
}