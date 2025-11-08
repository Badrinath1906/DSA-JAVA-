class Solution {
    private int countlive(int[][]board, int i,int j ,int rows, int cols){
        int count=0;
        for(int x=-1;x<=1;x++){
            for(int y=-1;y<=1;y++){
                if(x==0 && y==0) continue;
                int r=x+i,c=y+j;
                if(r>=0 && r<rows && c>=0 && c<cols && (board[r][c]==1|| board[r][c]==2)) count++;
            }
        }
        return count;
    }
    public void gameOfLife(int[][] board) {
        int rows = board.length;
        int cols = board[0].length;
        for(int i=0; i<rows; i++){
            for(int j=0;j<cols;j++){
                int Liveneighbours= countlive(board,i,j, rows,cols);

                if(board[i][j]==1 && (Liveneighbours<2||Liveneighbours>3))     board[i][j]=2; // live wala dead mein convert ho gya
                if(board[i][j]==0  &&  ( Liveneighbours==3))  board[i][j]=3; //dead wala live mein convert ho gya
            }
        }
                for(int i=0;  i<rows; i++){
                     for(int j=0;j<cols;j++){
                        board[i][j] %= 2;
            }
        }
    }    
}
