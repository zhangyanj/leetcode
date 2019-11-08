class Solution {
    public int trap(int[] height) {
        int len = height.length;
        if (len == 0) {
            return 0;
        }
        int leftmax = height[0];
        int rightmax = height[len-1];
        int leftindex = 0;
        int rightindex = len - 1;
        int ans = 0;
        while (leftindex <= rightindex) {
            if (rightmax > leftmax) {
                if (height[leftindex] > leftmax) {
                    leftmax = height[leftindex];
                } else {
                    ans += (leftmax - height[leftindex]);
                }
                leftindex++;
            } else {
                if (height[rightindex] > rightmax) {
                    rightmax = height[rightindex];
                } else {
                    ans += (rightmax - height[rightindex]);
                }
                rightindex--;
            }
        }
        return ans;
    }
}
