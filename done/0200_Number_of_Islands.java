class Solution {
    public int numIslands(char[][] grid) {
        if (grid.length == 0) {
            return 0;
        }
        int ans = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    ans++;
                    BFS(grid, i, j);
                }
            }
        }
        return ans;
    }
    
    public void BFS(char[][] grid, int i, int j) {
        if (i<0||i>=grid.length||j<0||j>=grid[0].length||grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
         BFS(grid, i+1, j);
         BFS(grid, i, j+1);
         BFS(grid, i-1, j);
         BFS(grid, i, j-1);
    }
}
