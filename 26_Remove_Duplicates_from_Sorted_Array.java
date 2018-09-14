class Solution {
    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        int crn = 0;
        int ans = 0;
        for (int i = 0;i < len; i++) {
            if (nums[i] != val) {
                nums[crn++] = nums[i];
                ans++;
            }
        }
        return ans;
    }
}
