class Solution {
    public int myAtoi(String str) {
        str=str.trim();
        long ans = 0;
        char[] arr = str.toCharArray();
        int len = arr.length;
        if (len == 0) {
            return 0;
        }
        int i = 0;
        char now;
        int flag = 1;
        if (arr[0] == '-') {
            flag = -1;
            i++;
        } else if (arr[0] == '+') {
            i++;
        }
        while (i<len&&arr[i] >= '0'&&arr[i] <= '9'){
            ans = ans*10+(arr[i] - '0');
            if (flag>0&&ans>=Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (flag<0&&ans>Integer.MAX_VALUE) {
                return Integer.MIN_VALUE;
            }
            i++;
            if (i>=len) {
                break;
            }
        }
        return (int)ans*flag;
    }
}
