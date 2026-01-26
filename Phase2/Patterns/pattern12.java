package phase2.Patterns;
public class pattern12 {
    // Function to print pattern12
    public static void pattern12(int n) {
        // Initial no. of spaces in row 1.
        int spaces = 2 * (n - 1);

        // Outer loop for the number of rows.
        for (int i = 1; i <= n; i++) {
            // For printing numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // For printing spaces in each row
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // For printing numbers in each row
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            /* As soon as the numbers for each iteration
            are printed, we move to the next row and give
            a line break otherwise all numbers would get 
            printed in 1 line*/
            System.out.println();

            /* After each iteration nos. increase by 
            2, thus spaces will decrement by 2*/
            spaces -= 2;
        }
    }

    public static void main(String[] args) {
        int N = 5;
        pattern12(N);
    }
}
 
