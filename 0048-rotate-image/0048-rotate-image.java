class Solution {
    public void rotate(int[][] matrix) {
        int left = 0;
        int right = matrix.length - 1;
        while (left < right) {
            int temp[] = matrix[left];
            matrix[left] = matrix[right];
            matrix[right] = temp;
            left++;
            right--;
        }
        for(int i=0; i<matrix.length; i++) {
            for(int j=i; j<matrix.length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}