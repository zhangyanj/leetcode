class Solution {
    public int findPeakElement(int[] nums) {
        int len = nums.length;
        if (len == 1) {
            return 0;
        }
        int start = 0;
        int end = len - 1;
        while (start <= end) {
            int middle = (start + end)/2;
            if (middle == 0&&nums[middle]>nums[middle+1]) {
                return middle;
            }
            if (middle == (len - 1)&&nums[middle]>nums[middle-1]) {
                return middle;
            }
            if (nums[middle]>nums[middle+1]&&nums[middle]>nums[middle-1]) {
                return middle;
            } else if (nums[middle] < nums[middle + 1]) {
                start = middle + 1;
            } else if (nums[middle] < nums[middle - 1]) {
                end = middle-1;
            }
        }
        return start;
    }
}
