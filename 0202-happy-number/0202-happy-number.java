class Solution {
    public boolean isHappy(int n) {
        int slow = n, fast = n;
        do{
            slow = findSquareSum(slow);
            fast = findSquareSum(findSquareSum(fast));
        }while(slow != fast);
        return slow == 1 ? true : false;

    }
    public int findSquareSum(int n){
        int sum = 0;
        while(n > 0){
            int r = n%10;
            sum += (r*r);
            n /= 10;
        }
        return sum;
    }
}