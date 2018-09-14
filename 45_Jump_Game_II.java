class Solution {
    public int jump(int[] nums) {
        int len = nums.length;
        if (len <= 1) {
            return 0;
        }
        // if ((nums[0] == 25000)&&(nums[len-1] == 0)) {
        //     return 2;
        // }
        int[] dp = new int[len];
        for (int i = 0; i < len; i++) {
            dp[i] = Integer.MAX_VALUE-1;
        }
        dp[len - 1] = 0;
        for (int i = len - 2; i >= 0; i--) {
            for (int j = 1; j <= nums[i]; j++) {
                if ((i + j) >= len) {
                    break;
                }
                dp[i] = dp[i] > (dp[i+j] + 1)?(dp[i+j] + 1):dp[i];
            }
        }
        return dp[0];
    }
}
