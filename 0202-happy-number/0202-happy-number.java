class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while(n>0){
            int sum = 0, pro = 1;
            while(n > 0){
                int r = n%10;
                sum = sum + (r*r);
                n /= 10;
            }
            if(sum == 1) return true;
            if(set.contains(sum)) return false;
            set.add(sum);
            n = (int)sum;
        }
        return false;
    }
}