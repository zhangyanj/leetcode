class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        int len1 = s1.length();
        int len2 = s2.length();
        int len3 = s3.length();
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        char[] arr3 = s3.toCharArray();
        if (len1+len2 !=len3) {
            return false;
        }
        boolean[][] dp = new boolean[len1+1][len2+1];
        dp[0][0] = true;
        for (int i = 1; i <= len1; i++) {
            dp[i][0] = (arr1[i-1] == arr3[i-1])&&dp[i-1][0];
        }
        for (int i = 1; i <= len2; i++) {
            dp[0][i] = (arr2[i-1] == arr3[i-1])&&dp[0][i-1];
        }
        for (int i = 1; i <= len1; i++) {
            for (int j = 1; j <= len2; j++) {
                if (arr1[i-1]!=arr3[i+j-1]&&arr2[j-1]!=arr3[i+j-1]) {
                    dp[i][j] = false;
                }
                if (arr1[i-1]==arr3[i+j-1]&&arr2[j-1]==arr3[i+j-1]) {
                    dp[i][j] = dp[i-1][j]||dp[i][j-1];
                } else {
                    if (arr1[i-1]==arr3[i+j-1]) {
                        dp[i][j] = dp[i-1][j];
                    }
                    if (arr2[j-1]==arr3[i+j-1]) {
                        dp[i][j] = dp[i][j-1];
                    }   
                }
            }
        }
        return dp[len1][len2];
    }
}
