class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    
    
    public boolean solve(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') continue;
                for (char c = '1'; c <= '9'; c++) {
                    if (isvoid(i, j, board, c)) {
                        board[i][j] = c;
                        if (solve(board)) return true;
                        else board[i][j] = '.';
                    }
                }
                return false;
            }
        }
        return true;
    }
    
    public boolean isvoid(int row, int column, char[][] board, int c) {
        for (int i = 0; i < 9; i++) {
            if(board[i][column] == c) return false;
            if(board[row][i] == c) return false;
            if(board[3*(row/3) + i/3][3*(column/3) + i%3] == c) return false;
        }
        return true;
    }
}