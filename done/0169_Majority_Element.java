class Solution {
    public int majorityElement(int[] nums) {
        int maxnum = nums[0];
        int maxcount = 1;
        int len = nums.length;
        if (len == 1) {
            return nums[0];
        }
        for (int i = 1; i < len; i++) {
            if (maxcount == 0) {
                maxcount = 1;
                maxnum = nums[i];
            } else {
                if (nums[i] == maxnum) {
                    maxcount++;
                } else {
                    maxcount--;
                }   
            }
        }
        return maxnum;
    }
}
