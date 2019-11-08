class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n==0) return false; 
        int tempn = n;
        int onect = 0;
        while (tempn!=1) {
            if ((tempn&1)==1) {
                return false;
            }
           tempn = tempn>>1;
        }
        return true;
    }
}
