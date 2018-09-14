class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int len = matrix.length;
        if (len == 0) {
            return false;
        }
        int len1 = matrix[0].length;
        if (len1 == 0) {
            return false;
        }
        int ind;
        for (ind = 0; ind < len&&(matrix[ind][len1 - 1]) < target;){
             ind++;
        }
        if (ind >= len) {
            return false;
        }
        for (int i = len1 - 1; i >= 0; i--) {
            if (matrix[ind][i] == target) {
                return true;
            }
        }
        return false;
    }
}
