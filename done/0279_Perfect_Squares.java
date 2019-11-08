class Solution {
    public int numSquares(int n) {
        int [] dp = new int[n+1];
        for (int i = 0; i <= n; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        for (int i = 1; i <= n; i++) {
            if((int)Math.sqrt(i)*(int)Math.sqrt(i) == i) {
                dp[i] = 1;
                continue;
            }
            int j = 1;
            while (j*j<i) {
                dp[i] = Math.min(dp[i-j*j] + 1, dp[i]);
                j++;
            }
        }
        return dp[n];
    }
}
