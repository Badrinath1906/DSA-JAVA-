class Solution {
    public int countNegatives(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int res = 0;
        int i = m-1;
        int j = 0;
        while (i >=0 && j < n) {
            if (grid[i][j] < 0) {
                res += n - j;
                i--;
            } else
                j++;
        }
        return res;
    }
}