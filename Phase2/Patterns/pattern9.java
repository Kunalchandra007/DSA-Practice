public class pattern9 {
//     * 
//    ***
//   *****
//  *******
// *********
// *********
//  *******
//   *****
//    ***
//     *
    // Function to print pattern9
    public static void pattern9(int n) {
        erectPyramid(n);
        invertedPyramid(n);
    }

    private static void erectPyramid(int n) {
        // Outer loop which will loop for the rows.
        for (int i = 0; i < n; i++) {
            // For printing the spaces before stars in each row
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // For printing the stars in each row
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            /* As soon as the stars for each iteration are printed,
            we move to the next row and give a line break */
            System.out.println();
        }
    }
    
    private static void invertedPyramid(int n) {
        // Outer loop which will loop for the rows.
        for (int i = 0; i < n; i++) {
            // For printing the spaces before stars in each row
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // For printing the stars in each row
            for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
                System.out.print("*");
            }

            /* As soon as the stars for each iteration are printed,
            we move to the next row and give a line break */
            System.out.println();
        }
    }
    
}
