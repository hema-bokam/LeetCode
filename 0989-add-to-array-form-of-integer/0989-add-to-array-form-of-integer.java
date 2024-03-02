class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> res = new ArrayList<>();
        int carry = 0, i = num.length - 1;
        while(i >= 0 || k > 0){
            carry += (k % 10);
            if(i >= 0) carry += num[i--];
            res.add(carry % 10);
            carry /= 10;
            k = k/10;
        }
        if(carry != 0) res.add(carry);
        reverse(res);
        return res;
    }
    public void reverse(List<Integer> arr){
        int i=0, j=arr.size()-1;
        while(i < j){
            int temp = arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j, temp);
            i++;
            j--;
        }
        return;
    }
}