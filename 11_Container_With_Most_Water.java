class Solution {
    public int maxArea(int[] height) {
        int len = height.length;
        if (len <= 1) {
            return 0;
        }
        int right = len - 1;
        int left = 0;
        int ans = 0;
        while (right > left) {
            int temp = Math.min(height[left], height[right]);
            int tempans = temp * (right - left);
            if (ans < tempans) {
                ans = tempans;
            }
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return ans;
    }
}
