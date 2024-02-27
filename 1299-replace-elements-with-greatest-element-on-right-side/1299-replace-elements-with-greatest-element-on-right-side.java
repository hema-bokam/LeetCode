class Solution {
    public int[] replaceElements(int[] arr) {
        int ge = -1, len = arr.length;
        for(int i=len-1; i>=0; --i){
            int val = arr[i];
            arr[i] = ge;
            ge = Math.max(ge, val);
        }
        return arr;
    }
}