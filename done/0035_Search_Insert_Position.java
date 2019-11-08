class Solution {
    public int searchInsert(int[] nums, int target) {
        int len = nums.length;
        int start = 0;
        int end = len - 1;
        int flag = -1;
        while (start <= end) {
            int middle = (start+end)/2;
            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] < target) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        if (end < 0) {
            return 0;
        }
        if (end > len -1) {
            return (len-1);
        }
        
        if (target > nums[end]) {
            return (end+1);
        } else {
            return end;
        }
    }
}

