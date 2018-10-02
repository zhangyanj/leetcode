class Solution {
    public int titleToNumber(String s) {
        char[] arr = s.toCharArray();
        int len = arr.length;
        int ans = 0;
        for (int i = 0; i < len; i++) {
            ans = ans*26+arr[i]-'A'+1;
        }
        return ans;
    }
}
