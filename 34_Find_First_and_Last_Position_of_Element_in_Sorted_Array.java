class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans = main(nums, 0, nums.length - 1, target);
        return ans;
    }
    
    public int[] main(int[] nums, int start, int end, int target){
        int[] ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;
        if (nums.length == 0) {
            return ans;
        }
        while (start <= end) {
            int middle = (start+end)/2;
            if (nums[middle] == target) {
                int[] n1 = main(nums, start, middle-1, target);
                int[] n2 = main(nums, middle+1, end, target);
                if (n1[0] == -1) {
                    ans[0] = middle;
                } else {
                    ans[0] = n1[0];
                }
                if (n2[1] == -1) {
                    ans[1] = middle;
                } else {
                    ans[1] = n2[1];
                }
                break;
            } else if (nums[middle] > target) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return ans;
    }
}
