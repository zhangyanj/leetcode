class Solution {
    public boolean isUgly(int num) {
        if (num == 0) {
            return false;
        }
        int ans = num;
        while (ans%2 == 0) ans/=2;
        while (ans%3 == 0) ans/=3;
        while (ans%5 == 0) ans/=5;
        return ans==1;
    }
}
