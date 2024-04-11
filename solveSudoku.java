public class solveSudoku {
    public boolean isSafe(char[][] board, int row, int col, int number) {
        //row & column
        for(int i = 0; i < board.length; i++) {
            if(board[i][col] == (char)(number + '0')) {
                return false;
            }
            if(board[row][i] == (char)(number + '0')) {
                return false;
            }
        }

        //grid
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;

        for(int i = sr; i < sr + 3; i++) {
            for(int j = sc; j < sc + 3; j++) {
                if(board[i][j] == (char)(number + '0')) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean helper(char[][] board, int row, int col) {
        if(row == board.length) {
            return true;
        }

        if(col == board[row].length) {
            return helper(board, row + 1, 0);
        }

        if(board[row][col] != '.') {
            return helper(board, row, col + 1);
        }

        for(int i = 1; i <= 9; i++) {
            if(isSafe(board, row, col, i)) {
                board[row][col] = (char)(i + '0');
                if(helper(board, row, col + 1)) {
                    return true;
                }
                board[row][col] = '.';
            }
        }
        return false;
    }

    public void solveSudoku(char[][] board) {
        helper(board, 0, 0);
    }

    public static void main(String[] args) {
        solveSudoku sudokuSolver = new solveSudoku();

        char[][] board = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        System.out.println("Original Sudoku:");
        printBoard(board);

        sudokuSolver.solveSudoku(board);

        System.out.println("\nSolved Sudoku:");
        printBoard(board);
    }

    public static void printBoard(char[][] board) {
        for (char[] row : board) {
            for (char c : row) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
