class Solution {
    public int[][] generateMatrix(int n) {
        int len = n;
        int[][] dp = new int[len][len];
        int f = 1;
        for (int i = 0; i < n/2; i++) {
            for (int j = 0; j < (len - 1 - 2*i); j++) {
                dp[i][i+j] = f++;
            }
            for (int j = 0; j < (len - 1 - 2*i); j++) {
                dp[i+j][len - 1 - i] = f++;
            }
            for (int j = 0; j < (len - 1 - 2*i); j++) {
                dp[len - 1 - i][len - 1 - i - j] = f++;
            }
            for (int j = 0; j < (len - 1 - 2*i); j++) {
                dp[len - 1 - i - j][i] = f++;
            }
        }
        if (n%2 == 1) {
            dp[n/2][n/2] = f;
        }
        return dp;
    }
}
