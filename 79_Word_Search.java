class Solution {
    public boolean exist(char[][] board, String word) {
        int len = board.length;
        if (len == 0) {
            return false;
        }
        int len1 = board[0].length;
        if (len1 == 0) {
            return false;
        }
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len1; j++) {
                if (main(board, word, 0, i, j)) {
                    return true;
                }
            }
            
        }
        return false;
        
    }
    
    public boolean main(char[][] board, String word, int index, int i, int j){
        if (index >= word.length()) {
            return true;
        }
        if (i < 0||i >= board.length||j < 0||j >= board[0].length) {
            return false;
        }
        if (board[i][j] == '#') {
            return false;
        }
        if (board[i][j] == word.charAt(index)) {
            char temp = board[i][j];
            board[i][j] = '#';
            if (main(board, word, index+1, i, j+1)||main(board, word, index+1, i+1, j)||main(board, word, index+1, i, j-1)||main(board, word, index+1, i-1, j)) {
                return true;
            }
            board[i][j] = temp;
        }
        return false;   
    }
}
