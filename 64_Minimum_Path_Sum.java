class Solution {
    public int minPathSum(int[][] grid) {
        int len = grid.length;
        if (len == 0) {
            return 0;
        }
        int len1 = grid[0].length;
        int[][] dp = new int[len][len1];
        dp[0][0] = grid[0][0];
        for (int i = 1; i < len; i++) {
            dp[i][0] = dp[i-1][0] + grid[i][0];
        }
        
        for (int i = 1; i < len1; i++) {
            dp[0][i] = dp[0][i - 1] + grid[0][i];
        }
        
        for (int i = 1; i < len; i++) {
            for (int j = 1; j < len1; j++) {
                dp[i][j] = Math.min(dp[i-1][j], dp[i][j - 1]) + grid[i][j];
            }
        }
        return dp[len-1][len1 - 1];
    }
}
