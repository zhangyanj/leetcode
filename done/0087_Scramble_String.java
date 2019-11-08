class Solution {
    public boolean isScramble(String s1, String s2) {
        int len = s1.length();
        int len2 = s2.length();
        if (len != len2) {
            return false;
        }
        if (len == 0) {
            return true;
        }
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        boolean[][][] dp = new boolean[len][len][len+1];
        
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                dp[i][j][1] = arr1[i] == arr2[j];       
            }
        }
        for (int n = 2; n <= len; n++) {
            for (int i = 0; i < len -n + 1; i++) {
                for (int j = 0; j < len - n + 1; j++) {
                    for (int k = 1; k < n; k++) {
                        dp[i][j][n] |= dp[i][j][k]&&dp[i+k][j+k][n-k]||dp[i][j+n-k][k]&&dp[i+k][j][n-k];
                    }
                }
            }
        }
        return dp[0][0][len];
    }
}
