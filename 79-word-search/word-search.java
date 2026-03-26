class Solution {
    public boolean exist(char[][] board, String word) {
        int m= board.length;
        int n= board[0].length;
        char[] arr =word.toCharArray();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==arr[0]&& search( board,arr, i, j,0))  return true;

            }
        }
        return false;
    }

    public boolean search(char[][] board, char[] arr, int i, int j, int k) {
        //Base Case..
        if(k==arr.length) return true;

        //Boundary check..
        if (i < 0 || i >= board.length || j >= board[0].length || j < 0 || board[i][j] != arr[k])
            return false;
            
        //mark visited..
        char temp = board[i][j];
        board[i][j] = '*';

        boolean found = search(board, arr, i + 1, j, k+1) ||
                search(board, arr, i - 1, j, k+1) ||
                search(board, arr, i, j + 1, k+1) ||
                search(board, arr, i, j - 1, k+1);

        //backtrack kr lo dubara se us postion ko ..
        board[i][j] = temp;
        return found;
    }
}