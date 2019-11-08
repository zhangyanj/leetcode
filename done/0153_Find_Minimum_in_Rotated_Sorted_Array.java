class Solution {
    public int findMin(int[] nums) {
        int len = nums.length;
        if (len == 1) {
            return nums[0];
        }
        int start = 0;
        int end = len - 1;
        while (start <= end) {
            int middle = (start + end)/2;
            if (middle == 0&&nums[middle] < nums[middle + 1]) {
                return nums[middle];
            }
            if (middle == len - 1&&nums[middle] < nums[0]&&nums[middle] < nums[middle - 1]) {
                return nums[middle];
            }
            if (nums[middle] < nums[middle + 1]&&nums[middle] < nums[middle - 1]) {
                return nums[middle];
            }
            if (nums[middle] <= nums[len - 1]) {
                end = middle-1;
            }else if (nums[middle] >= nums[0]) {
                start = middle + 1;
            }
        }
        return nums[start];
        // if (len == 0) {
        //     return nums[0];
        // }
        // for (int i = 1; i < len; i++) {
        //     if (nums[i] < nums[i-1]) {
        //         return nums[i];
        //     }
        // }
        // return nums[0];
    }
}
