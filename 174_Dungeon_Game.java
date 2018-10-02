class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        //假设初始生命值为0，那么各条路途中，血量最小情况的最大值。
        int len = dungeon.length;
        int len1 = dungeon[0].length;
        int[][] dp = new int[len+1][len1+1];
        for (int i = len; i >= 0; i--) {
            for (int j = len1; j >= 0; j--) {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }
        dp[len][len1-1] = 1;
        for (int i = len-1; i >= 0; i--) {
            for (int j = len1-1; j >= 0; j--) {
                dp[i][j] = Math.max(1, Math.min(dp[i][j+1], dp[i+1][j])-dungeon[i][j]);
            }
        }
        return dp[0][0];
    }
}
