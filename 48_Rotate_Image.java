class Solution {
    public void rotate(int[][] matrix) {
        int len = matrix.length;
        if (len <= 1) {
            return;
        }
        for (int i = 0; i < len/2; i++) {
            //起始点是 i i点
            for (int j = 0; j < len-1-2*i; j++) {
                int temp = matrix[i][i+j];
                matrix[i][i+j] = matrix[len-1-i-j][i];
                matrix[len-1-i-j][i] = matrix[len-1-i][len-1-i-j];
                matrix[len-1-i][len-1-i-j] = matrix[i+j][len-1-i];
                matrix[i+j][len-1-i] = temp;
            }
        }
    }
}
