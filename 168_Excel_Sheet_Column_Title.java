class Solution {
    public String convertToTitle(int n) {
        String ans = "";
        if (n == 1) {
            return "A";
        }
        while (n != 0) {
            n--;
            ans = (char)(n%26 + 'A') + ans;
            n = n/26;
        }
        return ans;
    }
}
