class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] ans = new int[len];
        ans[len - 1] = 1;
        for (int i = 1; i < len; i++) {
            ans[len - 1 - i] = ans[len - i]*nums[len - i];
        }
        int nowji = 1;
        for (int i = 0; i < len; i++) {
            ans[i] = ans[i] * nowji;
            nowji*=nums[i];
        }
        return ans;
    }
}
