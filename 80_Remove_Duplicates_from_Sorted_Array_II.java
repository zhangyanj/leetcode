class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        if (len <= 2) {
            return len;
        }
        int count = 1;
        int nowindex = 1;
        int preindex = 1;
        while (nowindex < len) {
            if (nums[nowindex] == nums[nowindex - 1]) {
                count++;
                if (count <= 2) {
                    nums[preindex++] = nums[nowindex++];
                } else {
                    nowindex++;
                }
            } else {
                nums[preindex++] = nums[nowindex++];
                count = 1;
            }
        }
        return preindex;
    }
}
