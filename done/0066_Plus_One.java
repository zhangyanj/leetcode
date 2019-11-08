class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        int jinwei = 1;
        for (int i = len - 1; i >= 0; i--) {
            int now = (digits[i] + jinwei)%10;
            jinwei = (digits[i] + jinwei)/10;
            digits[i] = now;
        }
        if (jinwei == 1) {
            int[] ans = new int[len + 1];
            ans[0] = 1;
            for (int i = 1; i <= len; i++) {
                ans[i] = digits[i-1];
            }
            return ans;
        }
        return digits;
    }
}
