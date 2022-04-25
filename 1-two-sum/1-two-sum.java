class Solution {
    public int[] twoSum(int[] a, int target) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        int b;
        for(int i=0;i<a.length;i++){
            b=target-a[i];
            if(map.containsKey(b) && map.get(b)!=i) return new int[]{map.get(b),i};
            else map.put(a[i],i);
        }
        return new int[]{};
    }
}