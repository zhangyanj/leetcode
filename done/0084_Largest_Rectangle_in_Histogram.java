class Solution {
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
