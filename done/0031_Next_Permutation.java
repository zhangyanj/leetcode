class Solution {
    public void nextPermutation(int[] nums) {
        int len = nums.length;
        int targeti = -1;
        int targetj = -1;
        for (int i = len - 2; i >= 0; i--) {
            for (int j = i + 1; j < len; j++) {
                if (nums[j] > nums[i]) {
                    targeti = i;
                    i = -1;
                    break;
                }
            }
        }
        // System.out.println(targeti);
        if (targeti != -1) {
            for (int j = targeti + 1; j < len; j++) {
                if (nums[j] > nums[targeti]) {
                    targetj = j;
                }
            }
        }

        // System.out.println(targetj);
        if (targeti == -1) {
            for (int i = 0; i <= (len-1)/2; i++) {
                int temp = nums[i];
                nums[i] = nums[len-1-i];
                nums[len-1-i] = temp;
            }
        } else {
            int temp = nums[targeti];
            nums[targeti] = nums[targetj];
            nums[targetj] = temp;
            sort(nums, targeti+1, len-1);
        }
    }
    
    public int[] sort(int[] nums, int start, int end){
        for (int i = end; i >= start ; i--) {
            int max = nums[start];
            int maxindex = start;
            for (int j = start; j <= i; j++) {
                if (nums[j] > max) {
                    max = nums[j];
                    maxindex = j;
                }
            }
            int temp = nums[maxindex];
            nums[maxindex] = nums[i];
            nums[i] = temp;
        }
        return nums;
    }
}

