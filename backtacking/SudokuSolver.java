public class SudokuSolver {

    public static boolean sudokuSolver(int[][] sudoku, int row, int col) {

        // ✅ BASE CASE: If we reach the end of the grid (9x9)
        if (row == 9) return true;

        // Calculate next cell's position
        int nextRow = row, nextCol = col + 1;
        if (col + 1 == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }

        // ✅ If the cell is already filled, move to the next cell
        if (sudoku[row][col] != 0) {
            return sudokuSolver(sudoku, nextRow, nextCol);
        }

        // ✅ Try placing digits 1 to 9
        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(sudoku, row, col, digit)) {
                sudoku[row][col] = digit; // place digit

                if (sudokuSolver(sudoku, nextRow, nextCol)) {
                    return true; // found solution
                }

                sudoku[row][col] = 0; // ❌ backtrack
            }
        }

        // No digit worked, backtrack
        return false;
    }

    // ✅ Helper function to check if placing digit is valid
    public static boolean isSafe(int[][] sudoku, int row, int col, int digit) {

        // Check row & column
        for (int i = 0; i < 9; i++) {
            if (sudoku[row][i] == digit || sudoku[i][col] == digit) {
                return false;
            }
        }

        // Check 3x3 grid
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;

        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (sudoku[i][j] == digit) {
                    return false;
                }
            }
        }

        return true; // All checks passed
    }

    // ✅ Utility function to print board
    public static void printSudoku(int[][] sudoku) {
        for (int[] row : sudoku) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    // ✅ Main function to test
    public static void main(String[] args) {
        int[][] board = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        if (sudokuSolver(board, 0, 0)) {
            System.out.println("Solved Sudoku:");
            printSudoku(board);
        } else {
            System.out.println("No solution exists.");
        }
    }
}
