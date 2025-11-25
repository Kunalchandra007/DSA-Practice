public class pascaltriangle {

    // Function to print Pascal's Triangle
    public static void printPascal(int rows) {
        for (int i = 0; i < rows; i++) {
            // Print leading spaces for alignment
            for (int space = 0; space < rows - i; space++) {
                System.out.print(" ");
            }

            // Print values in the row
            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);   // Formula to generate next number
            }
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {
        int n = 5;   // Number of rows you want
        printPascal(n);
    }
}