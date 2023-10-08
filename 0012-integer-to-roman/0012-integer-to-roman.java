class Solution {
    public String intToRoman(int num) {
        int sum = 0;
        StringBuilder sb = new StringBuilder();
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "I");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(90, "XC");
        map.put(100, "C");
        map.put(400, "CD");
        map.put(500, "D");
        map.put(900, "CM");
        map.put(1000, "M");
        for(int i=num; i>=1; i--){
            if(map.containsKey(i)){
                sb.append(map.get(i));
                i = num - i + 1;
                num = i-1;
            }
        }
        return sb.toString();
    }
}