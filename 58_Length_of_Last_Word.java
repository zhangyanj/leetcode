class Solution {
    public int lengthOfLastWord(String s) {
        char[] arr = s.toCharArray();
        int len = arr.length;
        if (len == 0) {
            return 0;
        }
        int ct = 0;
        int pr = 0;
        int ll = 1;
        int tail = len-1;
        while (tail>=0&&arr[tail] == ' ') {
            ll++;
            tail--;
        }
        if (tail==0) {
            if (arr[0]==' ') {
                return 0;
            } else {
                return 1;
            }
        }
        for (int i = len-ll; i >= 0; i--) {
            if (arr[i] != ' ') {
                ct++;
            } else {
                break;
            }
        }
        return ct;
    }
}
