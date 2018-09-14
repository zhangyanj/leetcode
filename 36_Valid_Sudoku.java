class Solution {
    public boolean isValidSudoku(char[][] board) {
        // return smallkuaier(board, 0, 6);
        return hang(board)&&lie(board)&&kuaier(board);
        // return lie(board);
        // return kuaier(board);
    }
    
    public boolean hang(char[][] board) {
        boolean ans = true;
        for (int i = 0; i < 9; i++) {
            HashMap<Character, Integer> map = new HashMap<Character, Integer>();
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                if (map.containsKey(board[i][j])) {
                    return false;
                } else {
                    map.put(board[i][j], 1);
                }
            }
            // ans&=isvolid(map);
        }
        return ans;
    }
    public boolean lie(char[][] board) {
        boolean ans = true;
        for (int i = 0; i < 9; i++) {
            HashMap<Character, Integer> map = new HashMap<Character, Integer>();
            for (int j = 0; j < 9; j++) {
                if (board[j][i] == '.') {
                    continue;
                }
                if (map.containsKey(board[j][i])) {
                    return false;
                } else {
                    map.put(board[j][i], 1);
                }
            }
            // ans&=isvolid(map);
        }
        return ans;
    }    
    public boolean kuaier(char[][] board) {
        boolean ans = true;
        for (int i = 0; i < 9;) {
            for (int j = 0; j < 9;) {
                ans&=smallkuaier(board, i, j);
                j+=3;
            }
            i+=3;
        }
        return ans;
    }
    
    public boolean smallkuaier(char[][] board, int m, int n) {
        boolean ans = true;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = m; i < m+3; i++) {
            for (int j = n; j < n+3; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                if (map.containsKey(board[i][j])) {
                    return false;
                }else {
                    map.put(board[i][j], 1);
                }
            }
            // ans&=isvolid(map);
        }
        return ans;
    }
}
