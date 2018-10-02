class Solution {
    public int maxProduct(int[] nums) {
        int len = nums.length;
        int[] dp1 = new int[len];
        dp1[0] = nums[0];
        int[] dp2 = new int[len];
        dp2[0] = nums[0];
        for (int i = 1; i < len; i++) {
            dp1[i] = Math.max(dp1[i-1]*nums[i], dp2[i-1]*nums[i]);
            dp1[i] = Math.max(dp1[i], nums[i]);
            dp2[i] = Math.min(dp1[i-1]*nums[i], dp2[i-1]*nums[i]);
            dp2[i] = Math.min(dp2[i], nums[i]);
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < len; i++) {
            if (dp1[i] > max) {
                max = dp1[i];
            }
        }
        return max;
        
    }
}
