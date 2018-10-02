class Solution {
    public int rob(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        }
        if (len == 1) {
            return nums[0];
        }
        if (len == 2) {
            return Math.max(nums[0], nums[1]);
        }
        return Math.max(main(nums, 0, len-2), main(nums, 1, len-1));
    }
    public int main(int[] nums, int from, int to) {
        int len = to-from+1;
        int[] dp = new int[len];
        dp[0] = nums[from];
        dp[1] = Math.max(nums[from], nums[from+1]);
        for (int i = from+2; i <= to; i++) {
            dp[i-from] = Math.max(dp[i-from-1], dp[i-from-2] + nums[i]);
        }
        return dp[to-from];
    }
    
}
