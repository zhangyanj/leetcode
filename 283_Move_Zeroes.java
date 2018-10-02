class Solution {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        int left = 0;
        int right = 0;
        while (right < len) {
            while ((right < len - 1)&&nums[right] == 0) right++;
            nums[left] = nums[right];
            left++;
            right++;
        }
        for (int i = left; i < len; i++) {
            nums[i] = 0;
        }
    }
}
