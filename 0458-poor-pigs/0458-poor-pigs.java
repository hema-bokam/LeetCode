class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        // +1 because if pig doesn't die in N rounds, then pig will definitely die in N+1 th test, where N = minutesToTest / minutesToDie
        int rounds = minutesToTest / minutesToDie + 1;
        int pigs = 0;
        while(Math.pow(rounds, pigs) < buckets){
            pigs += 1;
        }
        return pigs;
    }
}