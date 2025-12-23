class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //brute force approach..
        /*  int m = matrix.length;
          int n = matrix[0].length;
        for( int i=0; i<m; i++){
            for( int j=0;j<n;j++){
                if(matrix[i][j]==target) return true;
            }
        }
        return false;*/

        int m = matrix.length;
        int n = matrix[0].length;
        // Staircase approach...
        int row = 0;
        int col = n - 1; // start at top-right

        while (row < m && col >= 0) {
            if (matrix[row][col] == target)
                return true;
            else if (matrix[row][col] > target)
                col--;      // move left...
            else
                row++;      // move down...
        }
        return false;

    }
}