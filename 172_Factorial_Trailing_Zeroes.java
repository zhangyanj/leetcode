class Solution {
    public int trailingZeroes(int n) {
        int ans = 0;
        int chu = 5;
        while (chu <= n) {
            System.out.println(n);
            ans+=n/chu;
            n/=5;
        }
        return ans;
    }
}
