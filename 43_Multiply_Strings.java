class Solution {
    public boolean isMatch(String s, String p) {
        int lens = s.length();
        int lenp = p.length();
        boolean[][] dp = new boolean[lens+1][lenp+1];
        dp[0][0] = true;
        for (int j = 1; j <= lenp; j++) {
            if (j == 1) {
                if (p.charAt(j-1)=='*') {
                    dp[0][j] = true;
                }
            } else {
                if (p.charAt(j-1)=='*'&&dp[0][j-1]) {
                    dp[0][j] = true;
                } 
            }
        }
        for (int j = 1; j <= lenp; j++) {
            for (int i = 1; i <= lens; i++) {
                if (p.charAt(j-1)=='?') {
                    dp[i][j] = dp[i-1][j-1];
                } else if (p.charAt(j-1)=='*') {
                    dp[i][j] = dp[i-1][j-1]||dp[i][j-1]||dp[i-1][j];
                }  else if (p.charAt(j-1)==s.charAt(i-1)) {
                    dp[i][j] = dp[i-1][j-1];
                } else {
                    dp[i][j] = false;
                }
            }
        }
        return dp[lens][lenp];
    }
}
