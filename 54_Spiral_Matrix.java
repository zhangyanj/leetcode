class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int len = matrix.length;
        List<Integer> ans = new ArrayList<Integer>();
        if (len == 0) {
            return ans;
        }
        int len1 = matrix[0].length;
        int level = Math.min(len, len1);
        for (int i = 0; i < level/2; i++) {
            //起始点是 i i点
            for (int j = 0; j < len1-1-2*i; j++) {
                ans.add(matrix[i][i+j]);
            }
            
            for (int j = 0; j < len-1-2*i; j++) {
                ans.add(matrix[i+j][len1-1-i]);
            }
            
            for (int j = 0; j < len1-1-2*i; j++) {
                ans.add(matrix[len-1-i][len1-1-i-j]);
            }
            
            for (int j = 0; j < len-1-2*i; j++) {
                ans.add(matrix[len-1-i-j][i]);
            }
        }
        if (level%2 == 1) {
            if (len == len1) {
                ans.add(matrix[len/2][len/2]);   
            }
            
            if (len > len1) {
                for (int i = level/2; i <= len - 1 - level/2; i++) {
                    ans.add(matrix[i][len1/2]);
                }
            }
            
            if (len < len1) {
                for (int i = level/2; i <= len1 - 1 - level/2; i++) {
                    ans.add(matrix[len/2][i]);
                }
            }
        }
        return ans;
    }
}


