class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len1 = m;
        int len2 = n;
        if (len2 == 0) {
            return;
        }
        int nowindex = len1 + len2 - 1;
        int index1 = len1 - 1;
        int index2 = len2 - 1;
        while ((index1 >= 0)&& (index2 >= 0)) {
            if (nums1[index1] > nums2[index2]) {
                nums1[nowindex--] = nums1[index1--];
            } else {
                nums1[nowindex--] = nums2[index2--];
            }
        }
        while (index2 >= 0) {
            nums1[nowindex--] = nums2[index2--];
        }
    }
}
