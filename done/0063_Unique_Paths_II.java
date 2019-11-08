class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int len = obstacleGrid.length;
        if (len == 0) {
            return 0;
        }
        int len1 = obstacleGrid[0].length;
        int[][] dp = new int[len][len1];
        if (obstacleGrid[0][0] == 1) {
            dp[0][0] = 0;
        } else {
            dp[0][0] = 1;
        }
        for (int i = 1; i < len; i++) {
            if (obstacleGrid[i][0] == 1) {
                dp[i][0] = 0;
            } else {
                dp[i][0] = dp[i-1][0];
            }
        }
        
        for (int i = 1; i < len1; i++) {
            if (obstacleGrid[0][i] == 1) {
                dp[0][i] = 0;
            } else {
                dp[0][i] = dp[0][i-1];
            }
        }
        
        for (int i = 1; i < len; i++) {
            for (int j = 1; j < len1; j++) {
                if (obstacleGrid[i][j] == 1) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }
        return dp[len-1][len1-1];
    }
}
