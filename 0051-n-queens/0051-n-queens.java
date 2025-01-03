class Solution {
    public void queen(char[][] board, int row, List<List<String>> ans) {
        if (row == board.length) {
            ans.add(makestring(board));
            return;
        }
        for (int col = 0; col < board.length; col++) {
            if (issafe(board, row, col)) {
                board[row][col] = 'Q';
                queen(board, row + 1, ans);
                board[row][col] = '.';
            }
        }
    }

    static boolean issafe(char[][] board, int row, int col) {
        // vertcally up
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q')
                return false;
        }

        // diogonally left
        int maxleft = Math.min(row, col);
        for (int i = 1; i <= maxleft; i++) {
            if (board[row - i][col - i] == 'Q')
                return false;
        }

        // diogonally right
        int maxright = Math.min(row, board.length - 1 - col);
        for (int i = 1; i <= maxright; i++) {
            if (board[row - i][col + i] == 'Q')
                return false;
        }

        return true;
    }

    public List<String> makestring(char[][] board) {
        List<String> l = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            l.add(new String(board[i]));
        }
        return l;
    }

    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        List<List<String>> ans = new ArrayList<>();
        queen(board, 0, ans);
        return ans;
    }
}