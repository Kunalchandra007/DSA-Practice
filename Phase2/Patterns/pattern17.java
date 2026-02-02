public class pattern17 {
    public static void pattern17(int n) {
        // Outer loop for the number of rows.
        for (int i = 0; i < n; i++) {
            
            // Printing spaces before characters.
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // Printing characters.
            char ch = 'A';
            int breakpoint = (2 * i + 1) / 2;
            for (int j = 1; j <= 2 * i + 1; j++) {
                System.out.print(ch);
                if (j <= breakpoint)
                    ch++;
                else
                    ch--;
            }

            // Move to the next line for the next row.
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int N = 5;
        pattern17(N);
    }
}

    

