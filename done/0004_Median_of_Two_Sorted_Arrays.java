class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        if (n > m) {
            // System.out.println("Hello World.");
            double ans = findMedianSortedArrays(nums2, nums1);
            return ans;
        }
        int l1 = 0;
        int l2 = 0;
        int r1 = 0;
        int r2 = 0;
        int c1 = 0;
        int c2 = 0;
        int low = 0;
        int high = n*2;
        while (low <= high) {
            c1 = (low+high)/2;
            c2 = m+n-c1;
            System.out.println(low);
            System.out.println(high);
            l1 = (c1 == 0)?Integer.MIN_VALUE:nums1[(c1-1)/2];
            r1 = (c1 == n*2)?Integer.MAX_VALUE:nums1[(c1)/2];
            l2 = (c2 == 0)?Integer.MIN_VALUE:nums2[(c2-1)/2];
            r2 = (c2 == m*2)?Integer.MAX_VALUE:nums2[(c2)/2];
            if (l1 > r2) {
                high = c1 - 1;
            } else if (l2 > r1) {
                low  = c1 + 1;
            } else {
                break;
            }
        }
        return (Math.min(r1, r2) + Math.max(l1, l2))/2.0;
    }
}

