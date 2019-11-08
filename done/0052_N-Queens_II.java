


class Solution {
    public int totalNQueens(int n) {
        char[][] arr = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = '.';
            }
        }
        return dfs(arr, 0, n);
    }
    
    public int dfs(char[][] arr, int row, int n) {
        if (row == n) {
            return 1;
        }
        int ct = 0;
        for (int i = 0; i < n; i++) {
            if (isValid(arr, row, i)) {
                arr[row][i] = 'Q';
                ct+=dfs(arr, row+1, n);
                arr[row][i] = '.';
            }
        }
        return ct;
    }

    
    public boolean isValid(char[][] arr, int row, int column) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j]=='Q'&&(column == j||row+column==i+j||i+column==j+row)) {
                    return false;
                }
            }
        }
        return true;
    }
}
