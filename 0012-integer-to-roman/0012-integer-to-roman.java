class Solution {
    public String intToRoman(int num) {
        String[] thousands = {"", "M", "MM", "MMM"};  // max possible num is 3999 
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] singleDigits = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return thousands[num / 1000] + hundreds[(num % 1000) / 100] + tens[((num % 1000)%100) / 10] + singleDigits[((num % 1000)%100)%10];
    }
}