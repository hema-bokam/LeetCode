class Solution {
    //1. HashMap to store key - rootEle and value as - number of binary trees with rootEle as root 
    //2. Traverse array
        // 2.1. every element itself is a binary tree with no children, so count = 1
        // 2.2. traverse hashmap and if arr[i] % key == 0 it is divisor and checkfor second divisor arr[i]/k
            //key and arr[i]/key can be left child and right child of arr[i].
        // 2.3. if arr[i]/k is present in hashmap then count += map.get(key) * map.get(arr[i]/key)
    //3. sum += count; 
    public int numFactoredBinaryTrees(int[] arr) {
        HashMap<Integer, Long> dp = new HashMap<>();
        long res = 0, mod = 1000000007L;
        int len = arr.length;
        Arrays.sort(arr);
        dp.put(arr[0], 1L); //store first element, it is BT so count of binary trees with element as root is 1
        for(int i=1; i<len; i++){
            long count = 1;
            for(Integer root : dp.keySet()){
                if(arr[i] % root == 0 && dp.containsKey(arr[i] / root)){
                    count += (dp.get(root) * dp.get(arr[i] / root));
                }
            }
            dp.put(arr[i], count);
        }
        for(Integer key : dp.keySet()){
            res = (res % mod + dp.get(key) % mod)%mod;
        }
        return (int)res;
    }
}