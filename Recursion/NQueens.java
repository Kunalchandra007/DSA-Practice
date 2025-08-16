package Recursion;
import java.util.*;

public class NQueens {

    private void solve(int col, List<String> board, List<List<String>> ans,
                       int[] leftRow, int[] upperDiagonal, int[] lowerDiagonal, int n) {
        // Base case: if we have filled all columns, store the solution
        if (col == n) {
            ans.add(new ArrayList<>(board));
            return;
        }

        // Try placing a queen in each row of this column
        for (int row = 0; row < n; row++) {
            // Check if placing queen at (row, col) is safe
            if (leftRow[row] == 0 && lowerDiagonal[row + col] == 0 
                && upperDiagonal[n - 1 + col - row] == 0) {

                // Place queen
                char[] rowArray = board.get(row).toCharArray();
                rowArray[col] = 'Q';
                board.set(row, new String(rowArray));

                // Mark positions as occupied
                leftRow[row] = 1;
                lowerDiagonal[row + col] = 1;
                upperDiagonal[n - 1 + col - row] = 1;

                // Recur for next column
                solve(col + 1, board, ans, leftRow, upperDiagonal, lowerDiagonal, n);

                // Backtrack (remove queen)
                rowArray[col] = '.';
                board.set(row, new String(rowArray));

                leftRow[row] = 0;
                lowerDiagonal[row + col] = 0;
                upperDiagonal[n - 1 + col - row] = 0;
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        List<String> board = new ArrayList<>();

        // Initialize empty chessboard with '.'
        String emptyRow = ".".repeat(n);
        for (int i = 0; i < n; i++) {
            board.add(emptyRow);
        }

        // Arrays to track attacked rows and diagonals
        int[] leftRow = new int[n];
        int[] upperDiagonal = new int[2 * n - 1];
        int[] lowerDiagonal = new int[2 * n - 1];

        // Start solving from column 0
        solve(0, board, ans, leftRow, upperDiagonal, lowerDiagonal, n);
        return ans;
    }

    // Main method for testing
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of N: ");
        int n = sc.nextInt();

        NQueens solver = new NQueens();
        List<List<String>> solutions = solver.solveNQueens(n);

        System.out.println("Total solutions: " + solutions.size());
        for (int i = 0; i < solutions.size(); i++) {
            System.out.println("Solution " + (i + 1) + ":");
            for (String row : solutions.get(i)) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}
