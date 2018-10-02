class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        if (len <= 1) {
            return 0;
        }
        int ans = 0;
        for (int i = 1; i < len; i++) {
            if(prices[i] > prices[i-1]){
                ans = ans + (prices[i] - prices[i-1]);
            }
        }
        return ans;
    }
}
