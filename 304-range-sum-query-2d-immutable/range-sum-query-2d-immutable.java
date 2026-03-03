class NumMatrix {
    static int[][] prefix;

    public NumMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        prefix = new int[m][n];
        prefix[0][0] = matrix[0][0];
        for(int i=1;i<n;i++){
            prefix[0][i] = matrix[0][i] + prefix[0][i-1];
        }
        for(int j=1;j<m;j++){
            prefix[j][0] = matrix[j][0] + prefix[j-1][0];
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                prefix[i][j] = matrix[i][j] + prefix[i-1][j] + prefix[i][j-1] - prefix[i-1][j-1];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
         int total = prefix[row2][col2];

        int up = (row1 > 0) ? prefix[row1-1][col2] : 0;
        int left = (col1 > 0) ? prefix[row2][col1-1] : 0;
        int overlap = (row1 > 0 && col1 > 0) ? prefix[row1-1][col1-1] : 0;

        return total - up - left + overlap;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */