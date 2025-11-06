class Solution {
    public int[] findBall(int[][] grid) {
        int m= grid.length;
        int n= grid[0].length;
        int[] res=new int[n];

        for( int col=0;col<n;col++){
            int currcol  = col;
            
            for( int row=0;row<m; row++){
                int nextcol= currcol + grid[row][currcol];
                if(nextcol<0 || nextcol>=n || grid[row][currcol]!=grid[row][nextcol]){
                    currcol= -1;
                    break;
                }
                currcol=nextcol;
            }
            res[col]= currcol;

        }
        return res;
        
    }
}