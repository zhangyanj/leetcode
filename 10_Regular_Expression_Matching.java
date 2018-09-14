class Solution {
    public boolean isMatch(String s, String p) {
        int lens = s.length();
        int lenp = p.length();
        boolean[][] dp = new boolean[lens+1][lenp+1];
        dp[0][0] = true;
        for (int j = 1; j <= lenp; j++) {
            if (j>1&&(p.charAt(j-1) == '*')&&dp[0][j-2]) dp[0][j] = true;
        }
        for (int j = 1; j <= lenp; j++) {
            for (int i = 1; i <= lens; i++) {
                if (j > 1&&p.charAt(j - 1) == '*') {
                    dp[i][j] = dp[i][j-2]||((s.charAt(i-1)==p.charAt(j - 2)||p.charAt(j - 2) == '.')&&dp[i-1][j]);
                } else {
                    dp[i][j] = (s.charAt(i-1) == p.charAt(j-1)||p.charAt(j-1)=='.')&&dp[i-1][j-1];
                }
            }
        }
        return dp[lens][lenp];
        
    }
}
