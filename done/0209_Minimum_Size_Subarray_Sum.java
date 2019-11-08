class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        }
        int left = 0;
        int right = 0;
        int min = Integer.MAX_VALUE;
        int sum = nums[0];
        while (right < len&&left < len) {
            while (sum < s&&right < len - 1) {
                right++;
                sum+=nums[right];
            }
            if (sum >= s) {
                min = min < (right - left + 1)?min:(right - left + 1);   
            }
            left++;
            sum-=nums[left-1];
        }
        if (min == Integer.MAX_VALUE) {
            return 0;
        } else {
            return min;   
        }
    }
}
