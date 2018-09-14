class Solution {
    public void setZeroes(int[][] matrix) {
        int len = matrix.length;
        if (len == 0) {
            return;
        }
        int len1 = matrix[0].length;
        boolean firrowhaszero = false;
        boolean fircolumnhaszero = false;
        for (int i = 0; i < len1; i++) {
            if (matrix[0][i] == 0) {
                 firrowhaszero = true;
            }
        }
        for (int i = 0; i < len; i++) {
            if(matrix[i][0] == 0){
                fircolumnhaszero = true;
            }
        }
        for (int i = 1; i < len; i++) {
            for (int j = 1; j < len1; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0; 
                    matrix[0][j] = 0; 
                }
            }
        }
        for (int i = 1; i < len; i++) {
            if (matrix[i][0] == 0) {
                for (int j = 0; j < len1; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        
        for  (int j = 1; j < len1; j++) {
            if (matrix[0][j] == 0) {
                for (int i = 0; i < len; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
        
        if (firrowhaszero) {
            for (int i = 0; i < len1; i++) {
                matrix[0][i] = 0;
            }
        }
        
        if (fircolumnhaszero) {
            for (int i = 0; i < len; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
