class Solution {
    public boolean search(int[] nums, int target) {
        int len = nums.length;
        if (len == 0) {
            return false;
        }
        int leftflag = nums[0];
        int rightflag = nums[len - 1];
        int start = 0;
        int end = len - 1;
        int middle = (start + end)/2;
        int to = 1;
        while (to<len) {
            if (nums[to] != nums[to-1]) {
                break;
            }
            to++;
        }
        while (start <= end) {
            middle = (start + end)/2;
            if (nums[middle] ==target) {
                return true;
            }
            if (nums[middle] >leftflag||(nums[middle] == leftflag&&middle < to)) {
                if (target > nums[middle]) {
                    start = middle + 1;
                } else {
                    if (target < nums[start]) {
                        start = middle+1;
                    } else {
                        end = middle-1;
                    }
                }
            } else if (nums[middle] <=rightflag) {
                if (target < nums[middle]) {
                    end = middle - 1;
                } else {
                    if (target > nums[end]) {
                        end = middle-1;
                    } else {
                        start = middle+1;
                    }
                }
            }
        }
        return false;
    }
}
