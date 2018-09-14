class Solution {
    public String addBinary(String a, String b) {
        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();
        int len1 = arr1.length;
        int len2 = arr2.length;
        int len = Math.max(len1, len2);
        int jin = 0;
        int one;
        int two;
        String ans = "";
        for (int i = len-1; i >= 0; i--) {
            if (i<len-len1) {
                one = 0;
            } else {
                one = arr1[len1+i-len] - '0';
            }
            if (i<len-len2) {
                two = 0;
            } else {
                two = arr2[len2+i-len] - '0';
            }
            int sum = one+two+jin;
            int now = sum%2;
            ans = now+ans;
            jin = sum/2;
        }
        if (jin == 1) {
            ans = "1"+ans;
        }
        return ans;
    }
}
