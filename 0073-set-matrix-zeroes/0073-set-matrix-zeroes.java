class Solution {
    public void setZeroes(int[][] matrix) {
        boolean firstRow = false, firstCol = false;
        int n = matrix.length;
        int m = matrix[0].length;
        //check zero in first row and col
        for(int i=0; i<m; i++) {
            if(matrix[0][i] == 0) {
                firstRow = true;
                break;
            }
        }
        for(int i=0; i<n; i++) {
            if(matrix[i][0] == 0) {
                firstCol = true;
                break;
            }
        }
        //mark the rows and columns which have zeros;
        for(int i=1; i<n; i++) {
            for(int j=1; j<m; j++) {
                if(matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        //set zeros based on the marker
        for(int i=1; i<n; i++) {
            for(int j=1; j<m; j++) {
                if(matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        //set zeros for first row and column;
        if(firstRow) {
            for(int i=0; i<m; i++) {
                matrix[0][i] = 0;
            }
        }

        if(firstCol) {
            for(int i=0; i<n; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}