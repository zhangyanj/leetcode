public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int ans = 0;
        int m = 1;
        for (int j = 0; j < 32; j++) {
            if ((n&m) == 1) ans++;
            m = m << 1;
        }
        return ans;
    }
}
