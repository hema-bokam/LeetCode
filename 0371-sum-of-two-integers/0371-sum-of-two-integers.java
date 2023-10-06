class Solution {
    public int getSum(int a, int b) {
        int i=0, carry = 0, sum=0;
        while(i < 32){
            int val1 = (a>>i) & 1;
            int val2 = (b>>i) & 1;
            if(((carry^val1)^val2) == 1){
                sum |= (1<<i);
            }
            if(val1 == 1 && val2 == 1) carry = 1;
            else if(carry == 1){
                if(val1 == 1 || val2 == 1) carry = 1;
                else carry = 0;
            }
            else carry = 0;
            i++;
        }
        return sum;
    }
}