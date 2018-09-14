class Solution {
    public void sortColors(int[] nums) {
        int one = 0;
        int two = 0;
        int three = 0;
        int len = nums.length;
        if (len == 0) {
            return;
        }
        for (int i =0; i < len; i++) {
            if (nums[i] == 0) {
                one++;
            } else if (nums[i] == 1) {
                two++;
            } else {
                three++;
            }
        }
        int j = 0;
        for (;j < one;) {
            nums[j] = 0;
            j++;
        }
        
        for (;j < one + two;) {
            nums[j] = 1;
            j++;
        }
        
        for (;j < one + two + three;) {
            nums[j] = 2;
            j++;
        }
    }
}
