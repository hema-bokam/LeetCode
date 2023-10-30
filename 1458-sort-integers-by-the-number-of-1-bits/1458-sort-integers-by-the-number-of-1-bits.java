class CustomComparator implements Comparator<Integer>{
    public int compare(Integer a, Integer b){
        int oneBitsinA = Integer.bitCount(a);
        int oneBitsinB = Integer.bitCount(b);
        if(oneBitsinA == oneBitsinB) return a-b;
        return oneBitsinA - oneBitsinB;
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