class Solution {
    public int lengthOfLIS(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len];
        int max = 0;
        for (int i = 0; i < len; i++) {
            dp[i] = 1;
            max=max>dp[i]?max:dp[i];
        }
        for (int i = 1; i < len; i++) {
            for (int j = i-1; j >=0; j--) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
            max=max>dp[i]?max:dp[i];
        }
        return max;
    }
}
