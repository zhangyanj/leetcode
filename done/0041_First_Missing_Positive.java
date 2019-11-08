class Solution {
    public int firstMissingPositive(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return 1;
        }
        int max = nums[0];
        for (int i  = 0; i < len; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        if (max <= 0) {
            return 1;
        }
        int[] dp = new int[max+1];
        for (int i  = 0; i < len; i++) {
            if (nums[i] > 0) {
                dp[nums[i]] = 1;   
            }
        }
        
        for (int i = 1; i <= max; i++) {
            if (dp[i] == 0) {
                return i;
            }
        }
        return (max+1);
        
        
    }
}
