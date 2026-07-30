class Solution {

    public boolean exist(char[][] board, String word) {

        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {

                if (board[r][c] == word.charAt(0)) {

                    if (dfs(board, r, c, word, 0))
                        return true;
                }
            }
        }

        return false;
    }

    public boolean dfs(char[][] board, int r, int c, String word, int wordIndex) {

        int rows = board.length;
        int cols = board[0].length;

        // Out of bounds
        if (r < 0 || r >= rows || c < 0 || c >= cols)
            return false;

        // Invalid case (visited or character mismatch)
        if (board[r][c] == ' ' || board[r][c] != word.charAt(wordIndex))
            return false;

        // Last character matched..
        if (wordIndex == word.length() - 1)
            return true;

        // Mark as visited...
        char ch = board[r][c];
        board[r][c] = ' ';

        // DFS in 4 directions..
        boolean found =
                dfs(board, r - 1, c, word, wordIndex + 1) ||
                dfs(board, r + 1, c, word, wordIndex + 1) ||
                dfs(board, r, c - 1, word, wordIndex + 1) ||
                dfs(board, r, c + 1, word, wordIndex + 1);

        // Backtrack...
        board[r][c] = ch;
        return found;
    }
}