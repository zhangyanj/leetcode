class Solution {
    public int numDecodings(String s) {
        int len = s.length();
        char[] arr = s.toCharArray();
        int[] dp = new int[len];
        if (len == 0) {
            return 0;
        }
        if (arr[0] - '0' == 0) {
            dp[0] = 0;
        } else {
            dp[0] = 1;
        }
        for (int i = 1; i < len; i++) {
            if (arr[i-1] - '0' > 2||arr[i-1] - '0' == 0||(arr[i] - '0' > 6&&arr[i-1] - '0' == 2)) {
                if (arr[i] - '0' == 0) {
                    dp[i] = 0;   
                } else {
                    dp[i] = dp[i-1];
                }
            } else if (arr[i-1] - '0' <= 2) {
                if (i == 1) {
                    if (arr[i] - '0' == 0) {
                        dp[i] = 1;   
                    } else {
                        dp[i] = 2;
                    }
                } else {
                    if (arr[i] - '0' == 0) {
                        dp[i] = dp[i - 2];   
                    } else {
                        dp[i] = dp[i-1] + dp[i - 2];   
                    }
                }
            }
        }
        return dp[len-1];
    }
}
