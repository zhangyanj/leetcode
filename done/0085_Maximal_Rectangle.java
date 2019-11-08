class Solution {
    public int maximalRectangle(char[][] matrix) {
        int len = matrix.length;
        if (len == 0) {
            return 0;
        }
        int len1 = matrix[0].length;
        if (len1 == 0) {
            return 0;
        }
        int[][] dp = new int[len][len1+1];
        for (int j = 0; j < len1; j++) {
            if (matrix[0][j] == '0') {
                dp[0][j] = 0;
            } else {
                dp[0][j] = 1;
            }
        }
        for (int i = 1;i < len; i++) {
            for (int j = 0; j < len1; j++) {
                if (matrix[i][j] == '0') {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = dp[i - 1][j] + 1;
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0;i < len; i++) {
            max = Math.max(max, largestRectangleArea(dp[i]));   
        }
        return max;
    }
    
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stock = new Stack<Integer>();
        int i = 0;
        int len = heights.length;
        if (len == 0) {
            return 0;
        }
        if (len == 1) {
            return heights[0];
        }
        int max = Integer.MIN_VALUE;
        heights = Arrays.copyOf(heights, heights.length + 1);
        while (i < heights.length) {
            if (stock.isEmpty() || heights[i] > heights[stock.peek()]) {
                stock.push(i++);
            } else {
                int t = stock.pop();
                max = Math.max(max, heights[t]*(stock.isEmpty()?i:(i - stock.peek() - 1)));
            }
        }
        return max;
    }
}
