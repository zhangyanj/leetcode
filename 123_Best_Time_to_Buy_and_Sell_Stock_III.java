class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        if (len <= 1) {
            return 0;
        }
        int ans = Integer.MIN_VALUE;
        int start = 0;
        for (int i = 1 ; i < len; i++) {
            if (prices[i] > prices[i - 1]) {
                start = i - 1;
                break;
            }
        }
        int end = len - 1;
        for (int i = len - 1 ; i > 0; i--) {
            if (prices[i] > prices[i - 1]) {
                end = i;
                break;
            }
        }
        for (int i = start ; i <= end; i++) {
            if (ans < (maxProfit(prices, 0, i) + maxProfit(prices, i+1, len - 1))) {
                ans = maxProfit(prices, 0, i) + maxProfit(prices, i+1, len-1);
            }
        }
        return ans;
    }
    
    public int maxProfit(int[] prices, int start, int end) {
        int len = prices.length;
        if (len <= 1||start >= end) {
            return 0;
        }
        int ans = Integer.MIN_VALUE;
        int[] dp = new int[len];
        dp[start] = prices[start];
        for (int i = start + 1; i <= end; i++) {
            if (prices[i] < dp[i-1]) {
                dp[i] = prices[i];
            } else {
                dp[i] = dp[i-1];
            }
            if ((prices[i] - dp[i]) > ans) {
                ans = prices[i] - dp[i];
            }
        }
        return ans;
    }
}

