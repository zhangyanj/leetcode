class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        if (len <= 1) {
            return 0;
        }
        int[] dp = new int[len];
        dp[0] = prices[0];
        for (int i = 1; i < len; i++) {
            if (prices[i] < dp[i-1]) {
                dp[i] = prices[i];
            } else {
                dp[i] = dp[i-1];
            }
        }
        int ans = Integer.MIN_VALUE;
        for (int i = 1; i < len; i++) {
            if ((prices[i] - dp[i]) > ans) {
                ans = prices[i] - dp[i];
            }
        }
        return ans;
        
    }
}
