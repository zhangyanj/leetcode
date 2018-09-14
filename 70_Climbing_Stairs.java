class Solution {
    public int climbStairs(int n) {
        if (n==1) return 1;
        if (n==2) return 2;
        int[][] from = {{1,2}};
        int[][] cheng = bitdouble(n-2);
        int[][] ans;
        ans = doubleMatrix(from, cheng);
        return ans[0][1];
    }
    
    public int[][] doubleMatrix(int[][] nums1, int[][] nums2) {
        int[][] ans = new int[nums1.length][nums2[0].length];
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2[0].length; j++) {
                for (int k = 0; k < nums2.length; k++) {
                    ans[i][j] = ans[i][j] + nums1[i][k]*nums2[k][j];
                }
            }
        }
        return ans;
    }
    public int[][] bitdouble(int n) {
        int[][] begin = {{0,1},{1,1}};
        int tempn = n;
        int[][] ans = {{1,0}, {0,1}};
        while (tempn!=0) {
            if (tempn%2 == 1) {
                ans = doubleMatrix(ans, begin);
            }
            begin = doubleMatrix(begin, begin);
            tempn = tempn >>1;
        }
        return ans;
    }
}
