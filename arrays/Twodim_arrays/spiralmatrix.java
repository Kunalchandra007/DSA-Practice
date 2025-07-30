package arrays.Twodim_arrays;

public class spiralmatrix {

    public static void printmatrix(int matrix[][]) {
        int n = matrix.length;         // number of rows
        int m = matrix[0].length;      // number of columns

        int left = 0;
        int right = m - 1;
        int top = 0;
        int bottom = n - 1;

        while (top <= bottom && left <= right) {
            // Top row (left to right)
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++;

            // Right column (top to bottom)
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;

            // Bottom row (right to left)
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
            }

            // Left column (bottom to top)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
        }
    }

    public static void main(String[] args) {
        int matrix[][] = {
            {1, 2, 3, 4},
            {2, 4, 5, 6},
            {5, 6, 3, 5}
        };
        printmatrix(matrix);
    }
}
