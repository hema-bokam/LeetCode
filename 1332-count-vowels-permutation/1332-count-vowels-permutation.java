class Solution {
    public int countVowelPermutation(int n) {
        if(n == 1) return 5;
        long[][] dp = new long[5][1+n];
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        map.put(0, new ArrayList<>(List.of(1)));
        map.put(1, new ArrayList<>(List.of(0, 2)));
        map.put(2, new ArrayList<>(List.of(0,1,3,4)));
        map.put(3, new ArrayList<>(List.of(2,4)));
        map.put(4, new ArrayList<>(List.of(0)));
        long ans = 0, mod = 1000000007;
        for(int i=0; i<5; i++){
            dp[i][1] = 1;
            if(n >= 2) dp[i][2] =  map.get(i).size();
        }
        for(int j = 3; j <= n; j++){
            for(int i=0; i<5; i++){
                long count = 0;
                for(int k = 0; k < map.get(i).size(); k++){
                    count = (count % mod + dp[map.get(i).get(k)][j-1] % mod)%mod;
                }
                dp[i][j] = count;
            }
        }
        for(int i=0; i<5; i++) ans = (ans % mod + dp[i][n] % mod)%mod;
        return (int)ans;
    }
}