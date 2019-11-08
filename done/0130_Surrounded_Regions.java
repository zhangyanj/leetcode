class Solution {
    char[][] board;
    public void solve(char[][] board1) {
        board = board1;
        if (board.length == 0) {
            return;
        }
        for (int i = 0; i < board.length; i++) {
            main(i, 0);
            main(i, board[0].length-1);
        }
        for (int i = 0; i < board[0].length; i++) {
            main(0, i);
            main(board.length-1, i);
        }
        
        
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'S') {
                    board[i][j] = 'O';
                }
            }
        }
    }
    
    public void main(int i, int j) {
        if (i<0||i>board.length-1||j<0||j>board[0].length-1||board[i][j] != 'O') {
            return;
        }
        board[i][j] = 'S';
        main(i-1, j);
        main(i, j-1);
        main(i+1, j);
        main(i, j+1);
    }
    
    // public boolean main(int i, int j) {
    //     if (board[i][j] == 'X') {
    //         return true;
    //     }
    //     if (i==0||i==board.length-1||j==0||j==board[0].length-1) {
    //         return false;
    //     }
    //     boolean b1 = main(i-1, j);
    //     boolean b2 = main(i, j-1);
    //     boolean b3 = main(i+1, j);
    //     boolean b4 = main(i, j+1);
    //     // if (i==1&&j==2) {
    //     //     System.out.println(b3);
    //     //     System.out.println(b4);
    //     // }
    //     if (b1&&b2&&b3&&b4) {
    //         board[i][j] = 'X';
    //         return true;
    //     } else {
    //         return false;
    //     }
    // }
}
