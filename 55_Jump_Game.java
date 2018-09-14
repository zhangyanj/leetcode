class Solution {
    public boolean canJump(int[] nums) {
        int len = nums.length;
        if (len <= 1) {
            return true;
        }
        boolean[] dp = new boolean[len];
        dp[len - 1] = true;
        for (int i = len - 2; i >= 0; i--) {
            boolean temp = false;
            for (int j = 1; j <= nums[i]; j++) {
                if ((i + j )> (len -1)) {
                    break;
                }
                temp = temp||dp[i + j];
            }
            dp[i] = temp;
        }
        return dp[0];
    }
}
