class Solution {
    List<List<String>> ans = new ArrayList<List<String>>();//记得初始化
    public List<List<String>> solveNQueens(int n) {
        char[][] arr = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = '.';
            }
        }
        dfs(arr, 0, n);
        return ans;
    }
    
    public void dfs(char[][] arr, int row, int n) {
        if (row == n) {
            ans.add(clon(arr));
            return;
        }
        for (int i = 0; i < n; i++) {
            if (isValid(arr, row, i)) {
                arr[row][i] = 'Q';
                dfs(arr, row+1, n);
                arr[row][i] = '.';
            }
        }
    }
    
    public List<String> clon(char[][] arr) {
        List<String> temp = new ArrayList<String>();
        for (int i = 0; i < arr.length; i++) {
            String s = "";
            for (int j= 0; j < arr.length; j++) {
                s+=arr[i][j];
            }
            temp.add(s);
        }
        return temp;
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
