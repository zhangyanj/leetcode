class Solution {
    public int maximalSquare(char[][] matrix) {
        int len = matrix.length;
        if (len == 0) {
            return 0;
        }
        int len1 = matrix[0].length;
        int[][] dp = new int[len][len1];
        int max = 0;
        for (int i = 0; i < len; i++) {
            if (matrix[i][0] == '1') {
                dp[i][0] = 1; 
                max = max>dp[i][0]?max:dp[i][0];
            } else {
                dp[i][0] = 0;
            }
        }
        
        for (int i = 0; i < len1; i++) {
            if (matrix[0][i] == '1') {
                dp[0][i] = 1;   
                max = max>dp[0][i]?max:dp[0][i];
            } else {
                dp[0][i] = 0;
            }
        }
        for (int i = 1; i < len; i++) {
            for (int j = 1; j < len1; j++) {
                if (matrix[i][j] == '0') {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = Math.min(dp[i][j-1], Math.min(dp[i-1][j], dp[i-1][j-1])) + 1;
                    max = max>dp[i][j]?max:dp[i][j];
                }
            }
        }
        return max*max;
    }
}
