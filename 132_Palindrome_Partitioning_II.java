class Solution {
    public int minCut(String s) {
        int len = s.length();
        char[] arr = s.toCharArray();
        boolean[][] isthat = new boolean[len][len];
        int[] count = new int[len];
        for (int j = 0; j <= len-1; j++) {
            count[j] = Integer.MAX_VALUE-1;
            for (int i = 0; i <= j; i++) {
                if (arr[i] == arr[j]&&(j-i<=1||isthat[i+1][j-1])) {
                    isthat[i][j] = true;
                    if (i == 0) {
                        count[j] = 1;
                    } else {
                        count[j] = Math.min(count[j], count[i-1]+1);   
                    }
                }
            }
        }
        return count[len-1]-1;
        // return work(arr, 0 ,len-1, isthat)-1;
    }
    // public int work(char[] arr, int from, int to, boolean[][] isthat) {
    //     if (isthat[from][to]) {
    //         return 1;
    //     }
    //     int res = Integer.MAX_VALUE;
    //     for (int i = from; i < to; i++) {
    //         res = Math.min(res, (work(arr, from, i, isthat) + work(arr, i+1, to, isthat)));
    //     }
    //     return res;
    // }
}
