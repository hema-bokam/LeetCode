class Solution {
    public int totalMoney(int n) {
        int weeks = n/7, days = n % 7;
        return sum(7)*weeks + sum(weeks-1)*7 + (weeks)*days + sum(days);
    }
    public int sum(int n){
        return (n*(n+1))/2;
    }
}