class Solution {
    public int numDistinct(String s, String t) {
        int lens = s.length();
        int lent = t.length();
        int[][] dp = new int[lens+1][lent+1];
        for (int i = 0; i < lens; i++) {
            dp[i][0] = 1; 
        }
        for (int i = 1; i < lent; i++) {
            dp[0][i] = 0;
        }
        for (int i = 1; i <= lens; i++) {
            for (int j = 1; j <= lent; j++) {
                if (s.charAt(i-1) == t.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j] + dp[i-1][j-1];
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[lens][lent];
    }
}
