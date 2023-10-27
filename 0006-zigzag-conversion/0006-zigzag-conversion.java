class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1 || s.length() <= numRows) return s;
        List<StringBuilder> list = new ArrayList<>(numRows);
        for(int i=0; i<numRows; i++) list.add(new StringBuilder(""));
        int idx = 0, len = s.length();
        boolean isDec = false;
        for(int i=0; i<len; i++){
            char ch = s.charAt(i);
            if(idx >=0 && isDec){
                list.get(idx).append(ch);
                if(idx > 0) idx--;
                else if(idx == 0){
                    idx++;
                    isDec = false;
                }
            }
            else{
                list.get(idx).append(ch);
                if(idx < numRows-1) idx++;
                else if(idx == numRows - 1){
                    idx--;
                    isDec = true;
                }
            }
        }
        StringBuilder res = new StringBuilder("");
        for(int i=0; i<numRows; i++){
            if(list.get(i).equals("")) continue;
            // System.out.println(list.get(i).toString());
            res.append(list.get(i));
        }
        return res.toString();
    }
}