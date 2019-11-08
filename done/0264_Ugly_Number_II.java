class Solution {
    public int nthUglyNumber(int n) {
        if (n<7) {
            return n;
        }
        int num2 = 1,num3 = 1,num5 = 1;
        int[] dp = new int[n+1];
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = Math.min(Math.min(dp[num2]*2, dp[num3]*3), dp[num5]*5);
            if (dp[i] == dp[num2]*2) num2++;
            if (dp[i] == dp[num3]*3) num3++;
            if (dp[i] == dp[num5]*5) num5++;
        }
        return dp[n];
    }
}
