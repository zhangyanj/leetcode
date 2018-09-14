class Solution {
    public int search(int[] nums, int target) {
        int len = nums.length;
        if (len == 0) {
            return -1;
        }
        int leftflag = nums[0];
        int rightflag = nums[len-1];
        if (leftflag <= rightflag) {
            int start = 0;
            int end = len - 1;
            while (start <= end) {
                int middle = (start+end)/2;
                if (target == nums[middle]) {
                    return middle;
                } else if (target > nums[middle]) {
                    start = middle + 1;
                } else {
                    end = middle - 1;
                }
            }
            return -1;
        }
        int start = 0;
        int end = len - 1;
        while (start <= end) {
            int middle = (start+end)/2;
            // System.out.println(start);
            // System.out.println(end);
            // System.out.println(middle);
            if (nums[middle] > rightflag) {
                // System.out.println("1111111111111");
                if (target == nums[middle]) {
                    return middle;
                } else if (target > nums[middle]) {
                    start = middle + 1;
                } else {
                    if (target >= nums[start]) {
                        end = middle - 1;
                    } else {
                        start = middle + 1;
                    }
                }
            }
            if (nums[middle] < leftflag) {
                // System.out.println("222222222222222");
                if (target == nums[middle]) {
                    return middle;
                } else if (target < nums[middle]) {
                    end = middle - 1;
                } else {
                    if (target <= nums[end]) {
                        start = middle + 1;
                    } else {
                        end = middle - 1;
                    }
                }
            }
        }
        return -1;
    }
}

