class CustomComparator implements Comparator<Integer>{
    public int compare(Integer a, Integer b){
        int oneBitsinA = findOneBits(a);
        int oneBitsinB = findOneBits(b);
        if(oneBitsinA == oneBitsinB) return a-b;
        return oneBitsinA - oneBitsinB;
    }
    public int findOneBits(int num){
        int i=0, count = 0;
        while(i <= 31){
            if(((num >> i)& 1) == 1) count++;
            i++;
        }
        return count;
    }
}
class Solution {
    public int[] sortByBits(int[] arr) {
        List<Integer> al = new ArrayList<>();
        for(int num : arr) al.add(num);
        Collections.sort(al, new CustomComparator());
        int[] res = al.stream().mapToInt(i -> i).toArray();
        return res;
    }
}