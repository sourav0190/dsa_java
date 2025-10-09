public class Knight {

    // Check if it's safe to place a knight at board[row][col]
    public static boolean isSafe(char[][] board, int row, int col) {
        int n = board.length;

        // Knight moves that can attack (only upper moves due to row-wise filling)
        int[][] moves = {
            {-2, -1},
            {-2, +1},
            {-1, -2},
            {-1, +2}
        };

        for (int[] move : moves) {
            int newRow = row + move[0];
            int newCol = col + move[1];
            if (newRow >= 0 && newCol >= 0 && newCol < n) {
                if (board[newRow][newCol] == 'K') {
                    return false;
                }
            }
        }

        return true;
    }

    // Place knights recursively
    public static void placeKnights(char[][] board, int row) {
        if (row == board.length) {
            print(board);
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'K';
                placeKnights(board, row + 1);
                board[row][col] = '0'; // backtrack
            }
        }
    }

    // Print the board
    public static void print(char[][] board) {
        for (char[] row : board) {
            for (char ch : row) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        int n = 4; // Try with 5, 6, 7...
        char[][] board = new char[n][n];

        // Initialize the board with 'X'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'o';
            }
        }

        placeKnights(board, 0);
    }
}
