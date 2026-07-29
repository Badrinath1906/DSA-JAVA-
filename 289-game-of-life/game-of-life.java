class Solution {
    private int countLive(int[][] board, int i, int j, int rows, int cols) {
        int count = 0;

        for (int x = -1; x <= 1; x++) {
            for (int y = -1; y <= 1; y++) {

                // Skip current cell
                if (x == 0 && y == 0)
                    continue;

                int r = i + x;
                int c = j + y;

                // Count original live cells
                if (r >= 0 && r < rows &&
                    c >= 0 && c < cols &&
                    (board[r][c] == 1 || board[r][c] == 2)) {
                    count++;
                }
            }
        }
        return count;
    }

    public void gameOfLife(int[][] board) {
        int rows = board.length;
        int cols = board[0].length;

        // First Pass
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int liveNeighbours = countLive(board, i, j, rows, cols);

                // Alive -> Dead
                if (board[i][j] == 1) {
                    if (liveNeighbours < 2 || liveNeighbours > 3)
                        board[i][j] = 2;
                }
                // Dead -> Alive
                else {
                    if (liveNeighbours == 3)
                        board[i][j] = 3;
                }
            }
        }

        // Second Pass
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                board[i][j] %= 2;
            }
        }
    }
}