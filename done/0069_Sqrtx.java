class Solution {
    public int mySqrt(int x) {
        int start = 0;
        int end = 46340;
        while (start < end) {
            int mid = start + (end - start)/2;
            if ((mid*mid)<x) {
                System.out.println(mid*mid);
                start = mid + 1;
            } else if ((mid*mid)>x) {
                System.out.println(mid*mid);
                end = mid - 1;
            } else {
                return mid;
            }
        }
        if (start*start > x) {
            return start - 1;
        }
        return start;
    }
}
