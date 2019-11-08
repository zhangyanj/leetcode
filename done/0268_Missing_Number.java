class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int temp = nums[i];
            if (temp == 0||temp == Integer.MIN_VALUE) {
                continue;
            }
            if (temp < 0) {
                temp = temp*-1;
            }
            
            if (nums[temp-1] > 0) {
                nums[temp-1] = nums[temp-1] * -1;   
            }
            if (nums[temp-1] == 0) {
                nums[temp-1] = Integer.MIN_VALUE;
            }
        }
        for (int i = 0; i < len; i++) {
            if (nums[i] >= 0) {
                return i+1;
            }
        }
        return 0;
    }
}
