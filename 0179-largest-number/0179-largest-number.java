class CustomComparator implements Comparator<String>{
    @Override
    public int compare(String s1, String s2){
        return (s2+s1).compareTo(s1+s2);
    }
}
class Solution {
    public String largestNumber(int[] nums) {
        List<String> list = Arrays.stream(nums).mapToObj(num -> Integer.toString(num)).collect(Collectors.toList());
        Collections.sort(list, new CustomComparator());
        StringBuilder sb = new StringBuilder("");
        for(String str : list){
            sb.append(str);
        }
        return sb.charAt(0) == '0' ? "0" : sb.toString();
    }
}