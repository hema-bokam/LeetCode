class Solution {
    public List<String> buildArray(int[] target, int n) {
        int len = target.length, val = 1, i = 0;
        List<String> res = new ArrayList<>();
        while(i < len){
            if(target[i] == val){
                res.add("Push");
                i++;
                val++;
            }
            else{
                res.add("Push");
                res.add("Pop");
                val++;
            }
        }
        return res;
    }
}