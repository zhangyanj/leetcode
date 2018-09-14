class Solution {
    public double myPow(double x, int n) {
        int newn = n;
        if (n == 0) {
            if (x == 0.0) {
                return 0.0;
            } else {
                return 1.0;
            }
        }

        if (x == 1.0) {
            return 1.0;
        }
        if (x == -1.0&&n%2==1) {
            return -1.0;
        }
        if (x == -1.0&&n%2==0) {
            return 1.0;
        }
        if (n<0) {
            newn = -n;
        }
        if ((x<-1||x>1)&&n == -2147483648) {
            return 0;
        }
        
        double newx = x;
        if (x<0) {
            newx = (double)-1*x;;
        }
        double ans = 1.0;
        double tempx = newx;
        int tempn = newn;
        while (tempn != 0) {
            if ((tempn & 1) == 1) {
                ans*=tempx;
            }
            tempx = tempx*tempx;
            tempn = tempn>>1;
        }
        int flag = 1;
        if (x<0&&(newn%2==1)) {
            flag = -1;
        }
        ans = (double)flag*ans;
        if (n<0) {
            return (double)1/ans;
        }
        return ans;
    }
}
