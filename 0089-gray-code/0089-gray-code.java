class Solution {
    // 00
    // 01
    // 11
    // 10
    public List<Integer> grayCode(int n) {
        if(n == 0) return new ArrayList<>(List.of(0));
        List<Integer> prevHalf = grayCode(n-1);
        List<Integer> currHalf = new ArrayList<>(prevHalf);
        int setBitVal = 1 << (n-1);
        for(int i = prevHalf.size()-1; i>=0; i--){
            currHalf.add(prevHalf.get(i) + setBitVal);
        }
        return currHalf;
    }
}