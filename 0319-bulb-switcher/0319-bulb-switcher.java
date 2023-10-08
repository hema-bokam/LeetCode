class Solution {
    public int bulbSwitch(int n) {
         // numbers with odd factors/ divisors will be on at the end
         // perfect squares will always have odd factors. find perfect squares from 1 to n
         return (int)Math.sqrt(n);
    }
}