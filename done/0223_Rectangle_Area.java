class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int higth = 0;
        int wigth = 0;
        int leftmax = Math.max(A,E);
        int bottommax = Math.max(B,F);
        int rigthtmin = Math.min(C,G);
        int topmin = Math.min(D,H);
        if (leftmax < rigthtmin) {
            wigth = rigthtmin - leftmax;
        }
        if (bottommax < topmin) {
            higth = topmin - bottommax;
        }
        return (C-A)*(D-B)+(G-E)*(H-F)-higth*wigth;
    }
}
