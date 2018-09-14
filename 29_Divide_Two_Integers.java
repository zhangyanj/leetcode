class Solution {
    public int divide(int dividend, int divisor) {
        int flag = 1;
        if (dividend == -2147483648&&divisor == -1) {
            return 2147483647;
        }
        if (divisor == -1) {
            return -dividend;
        }
        if (divisor == 1) {
            return dividend;
        }
        if ((dividend>0&&divisor<0)||(dividend<0&&divisor>0)) {
            flag = -1;
        }
        long dividend1 = dividend>0?dividend:(long)-1*dividend;
        long divisor1 = divisor>0?divisor:(long)-1*divisor;
        int sum = 0;
        long leave = dividend1;
        while (leave >= divisor1) {
            int anstp = 1;
            long sumtp = divisor1;
            while (sumtp << 1 <=leave) {
                anstp = anstp << 1;
                sumtp = sumtp << 1;
            }
            sum+=anstp;
            leave = leave - sumtp;
            sumtp = divisor1;
            anstp = 1;
        }
        if (flag < 0) {
            return -sum;
        }
        return sum;
    }
}
