class Solution {
    public String intToRoman(int num) {
        String one[] = {"", "M", "MM", "MMM"};
        String two[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String thr[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String fo[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return one[num/1000]+two[(num%1000)/100]+thr[(num%100)/10]+fo[(num%10)];
    }
}
