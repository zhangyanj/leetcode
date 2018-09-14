class Solution {
    public String longestPalindrome(String s) {
        // s = s.substring(3, s.length()-3);
        char[] arr1 = s.toCharArray();
        int len = arr1.length;
        if (len == 1) {
            return s;
        }
        char[] arr = new char[len];
        for (int i =0; i < len; i++) {
            arr[len-1-i] = arr1[i];
        }
        // System.out.println(arr);
        // System.out.println(arr1);
        int[][] dp = new int[len][len];
        
        for (int i = 0; i < len; i++) {
            if (arr[i] == arr1[0]) {
                dp[i][0] = 1;
            } else {
                dp[i][0] = 0;
            }
        }
        
        for (int i = 0; i < len; i++) {
            if (arr1[i] == arr[0]) {
                dp[0][i] = 1;
            } else {
                dp[0][i] = 0;
            }
        }
        for (int i = 1; i < len; i++) {
            for (int j = 1; j < len; j++) {
                if (arr[i] == arr1[j]) {
                    // System.out.println(i);
                    // System.out.println(j);
                    dp[i][j] = dp[i-1][j-1]+1;
                    // System.out.println(dp[i][j]);
                    // System.out.println("*********");
                } else {
                    dp[i][j] = 0;
                }
                // System.out.println(i);
                // System.out.println(j);
                // System.out.println(dp[i][j]);
                // System.out.println("*********");
            }
        }
        // System.out.println(dp[4][4]);
        int max = -1;
        int targetindex = -1;
        for (int i = 1; i < len; i++) {
            for (int j = 1; j < len; j++) {
                if (i + j + 2 - dp[i][j] == len) {
                    if (max < dp[i][j]) {
                        max = dp[i][j];
                        targetindex = j;
                    } 
                }
            }
        }
        // System.out.println(targetindex);
        // System.out.println(max);
        String ans = s.substring(targetindex-max+1 ,targetindex+1);
        return ans;
        
    }
}
