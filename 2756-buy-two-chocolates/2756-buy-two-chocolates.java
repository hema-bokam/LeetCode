class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        return prices[1]+prices[0] <= money ? (money - prices[0]-prices[1]) : money;
    }
}