class Solution {
    public int findMin(int[] nums) {
        int len = nums.length;
        if (len == 1) {
            return nums[0];
        }
        int start = 0;
        int end = len - 1;
        for (int i = 1; i < len; i++) {
            if (nums[i] == nums[i - 1]) {
                start = i;
            } else {
                break;
            }
        }
        for (int i = len - 2; i >= 0; i--) {
            if (nums[i] == nums[i + 1]) {
                end = i;
            } else {
                break;
            }
        }
        if (start >= end) {
            return nums[start];
        }
        if (nums[start] == nums[end]) {
            start++;
        }
        int leftflag = start;
        int rightflag = end;
        while (start <= end) {
            int middle = (start + end)/2;
            if (middle == 0&&nums[middle] < nums[middle + 1]) {
                return nums[middle];
            }
            if (middle == len - 1&&nums[middle] < nums[leftflag]&&nums[middle] < nums[middle - 1]) {
                return nums[middle];
            }
            if (nums[middle] < nums[middle + 1]&&nums[middle] < nums[middle - 1]) {
                return nums[middle];
            }
            if (nums[middle] <= nums[rightflag]) {
                end = middle-1;
            }else if (nums[middle] >= nums[leftflag]) {
                start = middle + 1;
            }
        }
        return nums[start];
    }
}
